package org.openmrs.module.blooddonationmanager.web.controller.patient;
<<<<<<< HEAD
=======

>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.*;
import org.openmrs.api.PatientService;
<<<<<<< HEAD
import org.openmrs.api.PersonService;
import org.openmrs.api.context.Context;
import org.openmrs.module.blooddonationmanager.Donor;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
import org.openmrs.module.blooddonationmanager.api.DonorService;
=======
import org.openmrs.api.context.Context;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
import org.openmrs.module.blooddonationmanager.api.model.PreparedDonorId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
=======

>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
<<<<<<< HEAD
import java.util.List;
import java.util.Random;
import org.openmrs.Location;
import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.PatientIdentifierType;
import org.openmrs.PersonAddress;
import org.openmrs.PersonAttribute;
import org.openmrs.PersonAttributeType;
import org.openmrs.PersonName;

=======
import java.util.Random;
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9

@Controller
@RequestMapping("/module/blooddonationmanager/addOrUpdate.form")
public class AddOrUpdateDonorController {

	/** Logger for this class and subclasses */
	protected final Log log = LogFactory.getLog(getClass());

	/*@RequestMapping("/module/BloodDonationManager/addOrUpdate.form")
	public void test(){

		System.out.println("testing");
	}*/


	@ModelAttribute("donorIdentifier")
	public String getDonorId(){
		return getNewIdentifier(getDonorIdPrefix());
	}

	@ModelAttribute("donorIdPrefix")
	public String getDonorIdPrefix(){
		return Context.getAdministrationService().getGlobalProperty("billing.identifier_prefix");
	}

	@ModelAttribute("patientIdentifier")
	public String getPatientIdentifier(){
		return getNewIdentifier(getDonorIdPrefix());
	}

	@RequestMapping(method=RequestMethod.GET)
	public String main(ModelMap model){
		Patient pat = new Patient();
		model.addAttribute("donor", pat);
		return "/module/blooddonationmanager/patient/addOrUpdateDonorForm";
	}

<<<<<<< HEAD
	@RequestMapping(value = "/module/blooddonationmanager/addOrUpdate.form", method = RequestMethod.GET)
	public void listDonors(ModelMap model) {


		PersonService personService=Context.getService(PersonService.class);
        DonorService donorService=Context.getService(DonorService.class);
		List<Donor> donorList=donorService.getAllDonors();
        model.addAttribute("donorList", donorList);
		model.addAttribute("user", Context.getAuthenticatedUser());
	}

=======
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	@RequestMapping(method=RequestMethod.POST)
	public String processSubmit(ModelMap map,
	                            @RequestParam("donorName") String donorName,
	                            @RequestParam(value="dobEstimated", required=false) Boolean dobEstimated,
	                            @RequestParam(value="existPat", required=false) String existPat,
	                            @RequestParam("donId") String donId,
<<<<<<< HEAD
								@RequestParam("patId") String patId,
=======
	                            @RequestParam("patId") String patId,
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	                            @RequestParam("donorAddress1") String donorAddress1,
	                            @RequestParam(value="donorAddress2", required=false) String donorAddress2,
	                            @RequestParam("cityVillage") String cityVillage,
	                            @RequestParam("country") String country,
	                            @RequestParam("countyDistrict") String countyDistrict,
	                            @RequestParam("neighborhoodCell") String neighborhoodCell,
	                            @RequestParam("postalCode") String postalCode,
	                            @RequestParam("region") String region,
	                            @RequestParam("stateProvince") String stateProvince,
	                            @RequestParam("subregion") String subregion,
	                            @RequestParam("townshipDivision") String townshipDivision,
	                            @RequestParam(value="donorPrepId", required=false) String donorPrepId,
	                            @RequestParam(value="preregistered", required=false) String preregistered,
	                            @RequestParam("fatherHusbandName") String fatherHusbandName,
	                            @RequestParam("gender") String gender,
<<<<<<< HEAD
	                            @RequestParam(value = "donorDob", required = false) String donorDob
	                            ) throws ParseException{

        Person person = new Person();
		//Donor donor =new Donor();
		//int personIdentifier = Integer.parseInt(patId);



        PersonService personService= Context.getPersonService();
		DonorService donorService=Context.getService(DonorService.class);

		BloodDonationManagerService bbService = Context.getService(BloodDonationManagerService.class);
        Location location = Context.getLocationService().getLocationByUuid("8d6c993e-c2cc-11de-8d13-0010c6dffd0f");

		if(existPat != ""){

            person = personService.getPerson(Integer.valueOf(existPat));

		}else{
	        if(preregistered == ""){
=======
	                            @RequestParam(value="donorDob", required=false) String donorDob
	                            ) throws ParseException{

        Patient patient = new Patient();
        PatientService patientService = Context.getPatientService();

		BloodDonationManagerService bbService = Context.getService(BloodDonationManagerService.class);
        String locationId = Context.getAdministrationService().getGlobalProperty("BloodDonationManager.location.id");
        Location location = new Location( Integer.valueOf(locationId) );

		if(existPat != ""){
			patient = patientService.getPatient(Integer.valueOf(existPat));
			PatientIdentifierType identType2 = patientService.getPatientIdentifierType( Integer.valueOf(Context.getAdministrationService().getGlobalProperty("BloodDonationManager.donorIdTypeId")));
	        PatientIdentifier donorIdentifier = new PatientIdentifier(donId, identType2, location );
	        patient.addIdentifier(donorIdentifier);

		}else{

			PatientIdentifierType identType = patientService.getPatientIdentifierType( Integer.valueOf(Context.getAdministrationService().getGlobalProperty("BloodDonationManager.patientIdTypeId")));
	        PatientIdentifierType identType2 = patientService.getPatientIdentifierType( Integer.valueOf(Context.getAdministrationService().getGlobalProperty("BloodDonationManager.donorIdTypeId")));
	        PatientIdentifier patientIdentifier = new PatientIdentifier(patId, identType, location );
	        PatientIdentifier donorIdentifier = new PatientIdentifier( donId, identType2, location );

	        if(preregistered == ""){
//				String donId = donorPrepId;
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9

				PreparedDonorId pdi = bbService.getPrepDonorIdbyIdentifier(donorPrepId);
				pdi.setUsed(true);
				pdi.setChangedBy(Context.getAuthenticatedUser());
				pdi.setDateChanged(new Date());
				pdi.setIdentifier(donorPrepId);

				bbService.savePreparedId(pdi);
<<<<<<< HEAD

			}


	        String[] personName = donorName.split("\\s+");
	        PersonName name = new PersonName();
	        if(personName.length>2){
	        	name = new PersonName(personName[0],personName[1],personName[2]);
	        }else{
	        	name.setGivenName(personName[0]);
	        	if(personName.length>1)
	        	name.setFamilyName(personName[1]);
	        	name.setMiddleName("");
	        }

=======
				donorIdentifier = new PatientIdentifier(donorPrepId, identType2, location);
			}


	        String[] patientName = donorName.split("\\s+");
	        PersonName name = new PersonName();
	        if(patientName.length>2){
	        	name = new PersonName(patientName[0],patientName[1],patientName[2]);
	        }else{
	        	name.setGivenName(patientName[0]);
	        	if(patientName.length>1)
	        	name.setFamilyName(patientName[1]);
	        	name.setMiddleName("");
	        }




>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	        DateFormat df = new SimpleDateFormat( "dd/MM/yy" );
	        boolean dobE = false;
	        if(dobEstimated != null)
	        	dobE = true;

<<<<<<< HEAD


=======
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	        PersonAddress donorAddress = new PersonAddress();
	        donorAddress.setAddress1(donorAddress1);
	        donorAddress.setAddress2(donorAddress2);
	        donorAddress.setCityVillage(cityVillage);
	        donorAddress.setCountry(country);
	        donorAddress.setCountyDistrict(countyDistrict);
	        donorAddress.setNeighborhoodCell(neighborhoodCell);
	        donorAddress.setPostalCode(postalCode);
	        donorAddress.setRegion(region);
	        donorAddress.setStateProvince(stateProvince);
	        donorAddress.setSubregion(subregion);
	        donorAddress.setTownshipDivision(townshipDivision);
	        donorAddress.setPreferred(true);

<<<<<<< HEAD
	        person.addName(name);
//	        PersonAttributeType pat = Context.getPersonService().getPersonAttributeTypeByName( "Father/Husband Name" );
//	        PersonAttribute pa = new PersonAttribute(pat, fatherHusbandName);
//            person.addAttribute(pa);
            person.setGender(gender);
            person.setBirthdate(df.parse(donorDob));
	        person.setBirthdateEstimated(dobE);
			person.addAddress(donorAddress);

			}

        personService.savePerson(person);
		Donor donor = new Donor();
		donor.setPersonId(person.getPersonId());

		//Saves personId in donor table
		donorService.saveDonor(donor);






        //redirects to donor encounter view for new patient.

		return "redirect:/module/blooddonationmanager/showDonorEncounters.form?personId=" + person.getPersonId();
=======

	//        SortedSet<PersonAddress> addresses = new TreeSet<PersonAddress>();
	//        addresses.add(donorAddress);

	        patient.addIdentifier( patientIdentifier );
	        patient.addIdentifier( donorIdentifier );
	        patient.addName( name );
	        PersonAttributeType pat = Context.getPersonService().getPersonAttributeTypeByName( "Father/Husband Name" );
	        PersonAttribute pa = new PersonAttribute(pat, fatherHusbandName);
	        patient.addAttribute(pa);
	        patient.setGender(gender);
	        patient.setBirthdate( df.parse(donorDob) );
	        patient.setBirthdateEstimated( dobE );
	//		patient.setAddresses(addresses);
			patient.addAddress(donorAddress);

			}
        patientService.savePatient( patient );

        //redirects to donor encounter view for new patient.

		return "redirect:/module/blooddonationmanager/showDonorEncounters.form?patientId=" + patient.getPatientId();
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	}


    private String getNewIdentifier(String prefix)
    {
        Calendar now = Calendar.getInstance();
        String shortName = prefix;
        String noCheck = shortName
            + String.valueOf( now.get( Calendar.YEAR ) ).substring( 2, 4 )
            + String.valueOf( now.get( Calendar.MONTH ) + 1 )
            + String.valueOf( now.get( Calendar.DATE ) )
            + String.valueOf( now.get( Calendar.MINUTE ) )
            + String.valueOf( new Random().nextInt( 999 ) );
        return noCheck + "-" + getCheckdigit( noCheck );
    }

    /**
     * Using the Luhn Algorithm to generate check digits
     * @param idWithoutCheckdigit
     * @return idWithCheckdigit
     */
    private static int getCheckdigit( String idWithoutCheckdigit )
    {
        idWithoutCheckdigit = idWithoutCheckdigit.trim().toUpperCase();
        int sum = 0;
        for ( int i = 0; i < idWithoutCheckdigit.length(); i++ )
        {
            char ch = idWithoutCheckdigit.charAt( idWithoutCheckdigit.length() - i - 1 );

            int digit = (int) ch - 48;
            int weight;
            if ( i % 2 == 0 )
            {
                weight = ( 2 * digit ) - (int) ( digit / 5 ) * 9;
            } else
            {
                weight = digit;
            }
            sum += weight;
        }
        sum = Math.abs( sum ) + 10;
        return ( 10 - ( sum % 10 ) ) % 10;
    }

}

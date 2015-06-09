package org.openmrs.module.blooddonationmanager.web.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

<<<<<<< HEAD
import org.openmrs.*;
import org.openmrs.api.PatientService;
import org.openmrs.api.PersonService;
import org.openmrs.api.context.Context;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
import org.openmrs.module.blooddonationmanager.api.model.BloodDonationManager;
=======
import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.Form;
import org.openmrs.Location;
import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
import org.openmrs.module.blooddonationmanager.api.model.BloodDonationManager;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
import org.openmrs.module.blooddonationmanager.api.model.BloodDonationManager;
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/module/blooddonationmanager/showDonorEncounters.form")
public class DonorEncountersController {
	
<<<<<<< HEAD
	public static void newEncounter(int personId){
		PersonService personService=Context.getPersonService();
		BloodDonationManagerService bbs = Context.getService(BloodDonationManagerService.class);
		//Patient patient = ps.getPatient(patientId);
		Person person=personService.getPerson(personId);
		
		Encounter enc = new Encounter();
		//enc.setCreator(Context.getAuthenticatedUser());
		//enc.setDateCreated(new Date());
       // Location loc = Context.getLocationService().getLocation(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.location.id")));
      //  enc.setLocation(loc);
		//enc.setPerson(person);
		//enc.setPersonId(person.getPersonId());
		//EncounterType encounterType =  Context.getEncounterService().getEncounterType(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.question.enctype.id")));
=======
	public static void newEncounter(int patientId){
		PatientService ps = Context.getPatientService();
		BloodDonationManagerService bbs = Context.getService(BloodDonationManagerService.class);
		Patient patient = ps.getPatient(patientId);
		
		Encounter enc = new Encounter();
		enc.setCreator(Context.getAuthenticatedUser());
		enc.setDateCreated(new Date());
        Location loc = Context.getLocationService().getLocation(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.location.id")));
        enc.setLocation(loc);
		enc.setPatient(patient);
		enc.setPatientId(patient.getPatientId());
		EncounterType encounterType =  Context.getEncounterService().getEncounterType(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.question.enctype.id")));
		enc.setEncounterType(encounterType);
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
		Form form = Context.getFormService().getForm(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.question.formId")));
		enc.setVoided(false);
		enc.setProvider(Context.getAuthenticatedUser().getPerson());
		enc.setUuid(UUID.randomUUID().toString());
		enc.setForm(form);
		enc.setEncounterDatetime(new Date());
		Context.getEncounterService().saveEncounter(enc);
		
<<<<<<< HEAD
		/*BloodDonationManager bb = new BloodDonationManager();
		bb.setQuestionnaire(enc);
		bb.setDateCreated(new Date());
		bb.setQuestionnaireProvider(Context.getAuthenticatedUser());
		bb.setPerson(person);
=======
		BloodDonationManager bb = new BloodDonationManager();
		bb.setQuestionnaire(enc);
		bb.setDateCreated(new Date());
		bb.setQuestionnaireProvider(Context.getAuthenticatedUser());
		bb.setPatient(patient);
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
		bb.setQuestionnaireComplete(false);
		bb.setTestComplete(false);
		bb.setBloodResultComplete(false);
		bb.setExpired(false);
		bb.setDisposed(false);
<<<<<<< HEAD
		bbs.saveBloodBank(bb);*/
	}
	
	/*public BloodDonationManager newTest(BloodDonationManager encounter){
=======
		bbs.saveBloodBank(bb);
	}
	
	public BloodDonationManager newTest(BloodDonationManager encounter){
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
		if (encounter.getTest() == null){
			Encounter test = new Encounter();
			test.setCreator(Context.getAuthenticatedUser());
			test.setDateCreated(new Date());
			test.setLocation(Context.getLocationService().getLocation(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.location.id"))));
			test.setPatient(encounter.getPatient());
			test.setPatientId(encounter.getPatient().getPatientId());
			test.setEncounterType(Context.getEncounterService().getEncounterType(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.test.enctype.id"))));
			test.setVoided(false);
			test.setProvider(Context.getAuthenticatedUser().getPerson());
			test.setUuid(UUID.randomUUID().toString());
			test.setForm(Context.getFormService().getForm(Integer.valueOf(Context.getAdministrationService().getGlobalProperty("bloodbank.test.formId"))));
			test.setEncounterDatetime(new Date());
			Context.getEncounterService().saveEncounter(test);
			encounter.setTest(test);
		}
		return encounter;
<<<<<<< HEAD
	}*/
	
	@ModelAttribute("person")
	public Person getPerson(@RequestParam("personId") int personId){
		//PatientService ps = Context.getPatientService();
		PersonService personService=Context.getPersonService();
		//return ps.getPatient(personId);
		return personService.getPerson(personId);
	}
	
	@ModelAttribute("encounters")
	public List<BloodDonationManager> getEncounters(@RequestParam("personId") int personId){
		BloodDonationManagerService bbs = Context.getService(BloodDonationManagerService.class);
		
		//List<BloodDonationManager> encounters = bbs.getRecordsByPatient(getPerson(personId));
		//List<BloodDonationManager> encounters = bbs.getRecordsByPatient(getPerson(personId));
		List<BloodDonationManager> encounters=bbs.getRecordsByPerson(getPerson(personId));

=======
	}
	
	@ModelAttribute("patient")
	public Patient getPatient(@RequestParam("patientId") int patientId){
		PatientService ps = Context.getPatientService();
		return ps.getPatient(patientId);
	}
	
	@ModelAttribute("encounters")
	public List<BloodDonationManager> getEncounters(@RequestParam("patientId") int patientId){
		BloodDonationManagerService bbs = Context.getService(BloodDonationManagerService.class);
		
		List<BloodDonationManager> encounters = bbs.getRecordsByPatient(getPatient(patientId));
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
		for (BloodDonationManager enc : encounters) {
			if((enc.getQuestionnaire() != null
    				&& enc.getQuestionnaire().getObs() != null ? enc.getQuestionnaire().getObs().size() : 0)>=
    				Integer.valueOf(Context.getAdministrationService().getGlobalProperty("blooddonationmanager.question.valid.count"))
    			){
<<<<<<< HEAD
				/*enc.setQuestionnaireComplete(true);
				bbs.saveBloodBank(newTest(enc));*/
=======
				enc.setQuestionnaireComplete(true);
				bbs.saveBloodBank(newTest(enc));
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
			}
        }
		
		return encounters;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
<<<<<<< HEAD
	public String viewList(@RequestParam("personId") int personId, ModelMap model) {
		String donorIdientifier = Context.getAdministrationService().getGlobalProperty("bloodbank.donorIdTypeId");
		//PatientIdentifier pi = getPerson(personId).getPatientIdentifier(Integer.valueOf(donorIdientifier));
		//model.addAttribute("donorId", pi);
		
		return "/module/blooddonationmanager/patient/showDonorEnc";
=======
	public String viewList(@RequestParam("patientId") int patientId, ModelMap model) {
		String donorIdientifier = Context.getAdministrationService().getGlobalProperty("bloodbank.donorIdTypeId");
		PatientIdentifier pi = getPatient(patientId).getPatientIdentifier(Integer.valueOf(donorIdientifier));
		model.addAttribute("donorId", pi);
		
		return "/module/bloodbank/patient/showDonorEnc";
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(ModelMap model, 
<<<<<<< HEAD
	                       @RequestParam("personId") int personId,
	                       @RequestParam("newEncounter") String newEncounter){
		if(newEncounter.equals("true")){
			newEncounter(personId);
		}
		return "redirect:/module/bloodbank/showDonorEncounters.form?patientId=" + personId;
=======
	                       @RequestParam("patientId") int patientId,
	                       @RequestParam("newEncounter") String newEncounter){
		if(newEncounter.equals("true")){
			newEncounter(patientId);
		}
		return "redirect:/module/bloodbank/showDonorEncounters.form?patientId=" + patientId;
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
	}
	
}

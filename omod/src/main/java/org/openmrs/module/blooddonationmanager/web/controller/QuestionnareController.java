package org.openmrs.module.blooddonationmanager.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.*;
import org.openmrs.api.context.Context;
import org.openmrs.module.blooddonationmanager.Questionnaire;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
import org.openmrs.module.blooddonationmanager.api.QuestionnareService;
import org.openmrs.web.WebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.*;
import javax.servlet.http.HttpSession;
import java.util.*;


@Controller
@RequestMapping("/module/blooddonationmanager/questionnare.form")
public class QuestionnareController {

	/** Logger for this class and subclasses */
	protected final Log log = LogFactory.getLog(getClass());


	@RequestMapping(method=RequestMethod.GET)
	public String main(ModelMap model){
		Person person = new Person();
		model.addAttribute("donor", person);
		return "/module/blooddonationmanager/questionnareForm";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processSubmit(ModelMap map, HttpSession httpSession,
	                            @RequestParam("healthy") String healthy,
								@RequestParam("personId") String personId,
								@RequestParam("malaria") String malaria,
	                            @RequestParam("pregnant") String pregnant,
								@RequestParam("allergy") String allergy,
								@RequestParam("onMedication") String onMedication,
	                            @RequestParam("onAsprin") String onAsprin,
	                            @RequestParam("donatedBlood") String donatedBlood,
	                            @RequestParam("bloodTransfusion") String bloodTransfusion,
	                            @RequestParam("organTransplant") String organTransplant,
	                            @RequestParam("needleStick") String needleStick,
	                            @RequestParam("syphilisGonorrhea") String syphilisGonorrhea,
	                            @RequestParam("earBodyPiercing") String earBodyPercing,
	                            @RequestParam("tatoo") String tatoo,
	                            @RequestParam("questionnareDate") String questionnareDate
	                            ) throws ParseException{

        Person person = new Person();


		QuestionnareService questionnareService=Context.getService(QuestionnareService.class);

		BloodDonationManagerService bbService = Context.getService(BloodDonationManagerService.class);


        try{
            Questionnaire questionnaire=new Questionnaire();
            int personID = Integer.parseInt(personId);
            //Saving the details

            questionnaire.setAllergy(allergy);
            questionnaire.setBloodTransfusion(bloodTransfusion);
            questionnaire.setDonatedBlood(donatedBlood);
            questionnaire.setHealthy(healthy);
            questionnaire.setEarBodyPiercing(earBodyPercing);
            questionnaire.setOnMedication(onMedication);
            questionnaire.setPerson(person);
            questionnaire.setOrganTransplant(organTransplant);
            questionnaire.setPregnant(pregnant);
            questionnaire.setQuestionnareDate(questionnareDate);
            questionnaire.setTatoo(tatoo);



            //save questionnare
            questionnareService.saveQuestionnare(questionnaire);
            httpSession.setAttribute(WebConstants.OPENMRS_MSG_ATTR, "Added Donor Questionnare Successfully");

        }
        catch (Exception ex)
        {
            httpSession.setAttribute(WebConstants.OPENMRS_MSG_ATTR, "Error adding donor questionnare");
            return "redirect:questionnareForm.form";
        }

        return "redirect:questionnareForm.form";

    }

			}




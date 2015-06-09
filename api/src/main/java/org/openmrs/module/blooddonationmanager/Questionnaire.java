/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.blooddonationmanager;

import org.openmrs.*;

import java.io.Serializable;
import java.util.Date;


/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */
public class Questionnaire implements Serializable{

    private static final long serialVersionUID = 1L;

	private Integer questionnareId;
	
	private Person person;
    private Integer donorId;
	
	private String healthy;
	private String malaria;
    private String pregnant;
    private String onMedication;
    private String allergy;
    private String onAsprin;
    private String donatedBlood;
    private String bloodTransfusion;
    private String organTransplant;
    private String needleStick;
    private String syphilisGonorrhea;
    private String earBodyPiercing;
    private String tatoo;
	private Date questionnareDate;




	
    /**
	 * @return the questionnareId
	 */
	public Integer getQuestionnareId() {
		return questionnareId;
	}

	/**
	 * @param donorId  to set
	 */
	public void setDonorId(Integer donorId) {
		this.donorId = donorId;
	}


	/**
	 * @return the bloodBankId
	 */
	public Integer getDonorId() {
		return donorId;
	}

	/**
	 * @param questionnareId the bloodBankId to set
	 */
	/*public void setDonorId(Integer donorId) {
		this.donorId = donorId;
	}*/




    /**
	 * @param questionnareDate the storageDate to set
	 */
    public void setQuestionnareDate(Date questionnareDate) {
    	this.questionnareDate = questionnareDate;
    }

    /**
     * @return the expiryDate
     */
    public Date getQuestionnareDate() {
    	return questionnareDate;
    }

    /**
	 * @return the patient
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the patient to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}



	public String setOnAsprin() {
		return onAsprin;
	}

	/**
	 * @param onAsprin to set
	 */
	public void getOnAsprin(String onAsprin) {
		this.onAsprin = onAsprin;
	}


	public String setMalaria(){
		return malaria;
	}

	public void getMalaria(String malaria){
		this.malaria=malaria;
	}


	public String setAllergy(String allergy){
		return this.allergy;
	}

	public void getAllergy(String allergy){
		this.allergy=allergy;
	}

	public String setOnMedication(String onMedication){
		return this.onMedication;
	}

	public void getOnMedication(String tatoo){
		this.onMedication=onMedication;
	}



	public String setOrganTransplant(String organTransplant){
		return this.organTransplant;
	}

	public void getOrganTrasplant(String organTransplant){
		this.organTransplant=organTransplant;
	}



	public String setDonatedBlood(String donatedBlood){
		return this.donatedBlood;
	}

	public void getDonatedBlood(String donatedBlood){
		this.donatedBlood=donatedBlood;
	}


	public String setHealthy(String healthy){
		return this.healthy;
	}

	public void getHealthy(String healthy){
		this.healthy=healthy;
	}



	public String setTatoo(String tatoo){
		return this.tatoo;
	}

	public void getTatoo(String tatoo){
		this.tatoo=tatoo;
	}




	public String setEarBodyPiercing(String earBodyPercing){
		return earBodyPiercing;
	}

	public void getEarBodyPiercing(String earBodyPiercing){
		this.earBodyPiercing=earBodyPiercing;
	}



	public String setPregnant(String pregnant){
		return this.pregnant;
	}

	public void getPregnant(String pregnant){
		this.pregnant=pregnant;
	}



	public String setBloodTransfusion(String bloodTransfusion){
		return this.bloodTransfusion;
	}

	public void getBloodTransfusion(String bloodTransfusion){
		this.bloodTransfusion=bloodTransfusion;
	}


}

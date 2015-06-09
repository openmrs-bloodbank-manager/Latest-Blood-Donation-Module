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
package org.openmrs.module.blooddonationmanager.api;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.blooddonationmanager.Questionnaire;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(BloodDonationService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface QuestionnareService extends OpenmrsService {



		//list all questionnares
		@Transactional(readOnly = true)
		List<Questionnaire> getAllQuestionnares();
		//gets a questionnaire
		@Transactional(readOnly = true)
		Questionnaire getQuestionnare(Integer questionnareId);
		//Saves a questionnaire
		Questionnaire saveQuestionnare(Questionnaire questionnaire);
		//deletes a questionnaire
		void purgeQuestionnare(Questionnaire questionnaire);
}
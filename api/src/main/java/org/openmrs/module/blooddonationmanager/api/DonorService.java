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
import org.openmrs.module.blooddonationmanager.Donor;
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
public interface DonorService extends OpenmrsService {
     
	/*
	 * Add service meblooddonationServicethods here
	 *
	 */


		//list all donors
		@Transactional(readOnly = true)
		List<Donor> getAllDonors();

		//gets a donor
		@Transactional(readOnly = true)
		Donor getDonor(Integer donorId);
		//Saves a donor
		Donor saveDonor(Donor donor);

		//deletes a donor
		void purgeDonor(Donor donor);
       Donor updateDonor(Donor donor);
}
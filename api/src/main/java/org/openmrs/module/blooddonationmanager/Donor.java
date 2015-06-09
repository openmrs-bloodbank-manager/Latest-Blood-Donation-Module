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
import java.util.Set;


/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */
public class Donor extends BaseOpenmrsObject implements Serializable{


	private static final long serialVersionUID = 1L;

	private Integer donorId;
	private Integer personId;

	/*private Set<Donor> donor;*/



	@Override
	public Integer getId() {
		return getDonorId();
	}

	@Override
	public void setId(Integer id) {
		setDonorId(id);
	}


	public Integer getDonorId() {
		return donorId;
	}

	public void setDonorId(Integer donorId) {
		this.donorId= donorId;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId= personId;
	}

}

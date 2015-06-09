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
package org.openmrs.module.blooddonationmanager.api.db.hibernate;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.OrderType;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.blooddonationmanager.Donor;
import org.openmrs.module.blooddonationmanager.api.db.BloodDonationManagerDAO;
import org.openmrs.module.blooddonationmanager.api.db.DonorDAO;
import org.openmrs.module.blooddonationmanager.api.model.BloodDonationManager;
import org.openmrs.module.blooddonationmanager.api.model.BlooddonationManagerForm;
import org.openmrs.module.blooddonationmanager.api.model.PreparedDonorId;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * It is a default implementation of  {@link BloodDonationManagerDAO}.
 */
public class HibernateDonorDAO implements DonorDAO {
	protected final Log log = LogFactory.getLog(this.getClass());

	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}




	@Override
	public List<Donor> getAllDonors() {
		return sessionFactory.getCurrentSession().createCriteria(Donor.class).list();
	}

	@Override
	public Donor getDonor(Integer donorId) {

		return (Donor) sessionFactory.getCurrentSession().get(Donor.class, donorId);
	}

	@Override
	public Donor saveDonor(Donor donor) {
		sessionFactory.getCurrentSession().save(donor);
		return donor;
	}

	@Override
	public void purgeDonor(Donor donor) {
		sessionFactory.getCurrentSession().delete(donor);

	}
}
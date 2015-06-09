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
import org.openmrs.module.blooddonationmanager.Questionnaire;
import org.openmrs.module.blooddonationmanager.api.db.QuestionnareDAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * It is a default implementation of  {@link QuestionnareDAO}.
 */
public class HibernateQuestionnareDAO implements QuestionnareDAO {

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
		public List<Questionnaire> getAllQuestionnares() {
			return sessionFactory.getCurrentSession().createCriteria(Questionnaire.class).list();
		}

		@Override
		public Questionnaire getQuestionnare(Integer questionnareId) {

			return (Questionnaire) sessionFactory.getCurrentSession().get(Questionnaire.class, questionnareId);
		}

		@Override
		public Questionnaire saveQuestionnare(Questionnaire questionnaire) {
			sessionFactory.getCurrentSession().save(questionnaire);
			return questionnaire;
		}

		@Override
		public void purgeQuestionnare(Questionnaire questionnaire) {
			sessionFactory.getCurrentSession().delete(questionnaire);

		}
}
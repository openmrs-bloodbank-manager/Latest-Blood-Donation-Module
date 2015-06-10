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
package org.openmrs.module.blooddonationmanager.api.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.blooddonationmanager.api.BloodDonationManagerService;
import org.openmrs.module.blooddonationmanager.api.QuestionnareService;

import org.openmrs.module.blooddonationmanager.api.db.QuestionnareDAO;


import org.openmrs.module.blooddonationmanager.Questionnaire;


import java.util.List;

/**
 * It is a default implementation of {@link BloodDonationManagerService}.
 */
public class QuestionnareServiceImpl extends BaseOpenmrsService implements QuestionnareService {

    protected final Log log = LogFactory.getLog(this.getClass());

    private QuestionnareDAO dao;

    public void setDao(QuestionnareDAO dao) {
        this.dao = dao;
    }
    /**
     * @return the dao
     */
    public QuestionnareDAO getDao() {
        return dao;
    }


    @Override
    public List<Questionnaire> getAllQuestionnares() {
        return dao.getAllQuestionnares();
    }

    @Override
    public Questionnaire getQuestionnare(Integer questionnareId) {
        return dao.getQuestionnare(questionnareId);
    }

    @Override
    public Questionnaire saveQuestionnare(Questionnaire questionnare) {
        return dao.saveQuestionnare(questionnare);
    }

    @Override
    public void purgeQuestionnare(Questionnaire questionnaire) {
        dao.purgeQuestionnare(questionnaire);

    }
}
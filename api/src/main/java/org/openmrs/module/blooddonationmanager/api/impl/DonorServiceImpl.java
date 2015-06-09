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
import org.openmrs.module.blooddonationmanager.api.DonorService;
import org.openmrs.module.blooddonationmanager.api.db.DonorDAO;
import org.openmrs.module.blooddonationmanager.Donor;


import java.util.List;

/**
 * It is a default implementation of {@link DonorService}.
 */
public class DonorServiceImpl extends BaseOpenmrsService implements DonorService {

    protected final Log log = LogFactory.getLog(this.getClass());

    private DonorDAO dao;


    public void setDao(DonorDAO dao) {
        this.dao = dao;
    }
    /**
     * @return the dao
     */
    public DonorDAO getDao() {
        return dao;
    }


    @Override
    public List<Donor> getAllDonors() {
        return dao.getAllDonors();
    }

    @Override
    public Donor getDonor(Integer donorId) {
        return dao.getDonor(donorId);
    }

    @Override
    public Donor saveDonor(Donor donor) {
        return dao.saveDonor(donor);
    }

    @Override
    public void purgeDonor(Donor donor) {
        dao.purgeDonor(donor);

    }
}
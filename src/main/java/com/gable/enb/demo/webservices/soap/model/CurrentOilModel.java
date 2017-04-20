/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.model;

import java.util.List;

/**
 *
 * @author goffity
 */
public class CurrentOilModel {

    private List<CurrentOilDataAccess> dataAccess;

    /**
     * @return the dataAccess
     */
    public List<CurrentOilDataAccess> getDataAccess() {
        return dataAccess;
    }

    /**
     * @param dataAccess the dataAccess to set
     */
    public void setDataAccess(List<CurrentOilDataAccess> dataAccess) {
        this.dataAccess = dataAccess;
    }

}

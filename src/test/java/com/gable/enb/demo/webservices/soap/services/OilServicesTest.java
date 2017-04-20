/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.services;

import com.gable.enb.demo.webservices.soap.model.CurrentOilModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author goffity
 */
public class OilServicesTest {

    public OilServicesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of currentOilServices method, of class OilServices.
     * @throws java.lang.Exception
     */
    @Test
    public void testCurrentOilServices() throws Exception {
        System.out.println("currentOilServices");
        OilServices instance = new OilServices();
        CurrentOilModel currentOilModel = instance.currentOilServices();
        
        assertNotNull(currentOilModel);
        assertNotNull(currentOilModel.getDataAccess().get(0).getPriceDate());
    }

}

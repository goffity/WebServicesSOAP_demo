/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author goffity
 */
public class CurrentOilPriceControllerTest {
    
    public CurrentOilPriceControllerTest() {
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
     * Test of getOilPrice method, of class CurrentOilPriceController.
     */
    @Test
    public void testGetOilPrice() {
        System.out.println("getOilPrice");
        CurrentOilPriceController instance = new CurrentOilPriceController();
        String expResult = "";
        String result = instance.getOilPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleRequestInternal method, of class CurrentOilPriceController.
     */
    @Test
    public void testHandleRequestInternal()
            throws Exception {
        System.out.println("handleRequestInternal");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CurrentOilPriceController instance = new CurrentOilPriceController();
        ModelAndView expResult = null;
        ModelAndView result = instance.handleRequestInternal(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

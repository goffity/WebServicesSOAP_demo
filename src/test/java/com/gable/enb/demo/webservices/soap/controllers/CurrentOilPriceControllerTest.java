/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 * @author goffity
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
@WebAppConfiguration
public class CurrentOilPriceControllerTest {

    private final Log logging = LogFactory.getLog(
            CurrentOilPriceControllerTest.class.getName());

    private MockMvc mockMvc;

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
        mockMvc = MockMvcBuilders.standaloneSetup(
                new CurrentOilPriceController()).build();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getOilPrice method, of class CurrentOilPriceController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetOilPrice() throws Exception {
        logging.info("testGetOilPrice()");
        
        MvcResult mvcResult = mockMvc.perform(post("/oil/")).andReturn();
    }

//    /**
//     * Test of handleRequestInternal method, of class CurrentOilPriceController.
//     */
//    @Test
//    public void testHandleRequestInternal()
//            throws Exception {
//        System.out.println("handleRequestInternal");
//        HttpServletRequest request = null;
//        HttpServletResponse response = null;
//        CurrentOilPriceController instance = new CurrentOilPriceController();
//        ModelAndView expResult = null;
//        ModelAndView result = instance.handleRequestInternal(request, response);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}

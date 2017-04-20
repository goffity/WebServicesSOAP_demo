/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.controllers;

import com.gable.enb.demo.webservices.soap.services.OilServices;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author goffity
 */
@Controller(value = "CurrentOilPriceController")
@RequestMapping(value = "/oil")
public class CurrentOilPriceController extends AbstractController {

    private final Log logging = LogFactory.getLog(
            CurrentOilPriceController.class.getName());

    @Autowired
    private OilServices oilServices;

    public CurrentOilPriceController() {
    }

    @RequestMapping(value = "/")
    public @ResponseBody
    String getOilPrice() {
        logging.info("getOilPrice()");

        return oilServices.currentOilServices();
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

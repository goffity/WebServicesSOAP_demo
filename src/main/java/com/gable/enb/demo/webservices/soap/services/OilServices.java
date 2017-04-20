/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author goffity
 */
@Service(value = "OilServices")
public class OilServices {

    private final Log logging = LogFactory.getLog(OilServices.class.getName());

    public String currentOilServices()
            throws ParserConfigurationException, SAXException, IOException {
        logging.info("currentOilServices()");

        // Call Web Service Operation
        com.pttplc.ptt_webservice.PTTInfo service = new com.pttplc.ptt_webservice.PTTInfo();
        com.pttplc.ptt_webservice.PTTInfoSoap port = service.getPTTInfoSoap12();
        // TODO initialize WS operation arguments here
        java.lang.String language = "";
        // TODO process result here
        java.lang.String result = port.currentOilPrice(language);
        System.out.println("Result = " + result);

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//        Document document = builder.parse(result);
        Document document = builder.parse(new InputSource(
                new ByteArrayInputStream(result.getBytes("utf-8"))));

        System.out.println(
                "document: " + document.getChildNodes().item(0).getNodeName());

        return result;
    }
}

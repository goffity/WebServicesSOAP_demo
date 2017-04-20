/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.services;

import com.gable.enb.demo.webservices.soap.model.CurrentOilDataAccess;
import com.gable.enb.demo.webservices.soap.model.CurrentOilModel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author goffity
 */
@Service(value = "OilServices")
public class OilServices {

    private final Log logging = LogFactory.getLog(OilServices.class.getName());

    public CurrentOilModel currentOilServices()
            throws ParserConfigurationException, SAXException, IOException {
        logging.info("currentOilServices()");

        CurrentOilModel currentOilModel = convertXMLReesponseToModel(getCurrentOilPriceFromWebServices());

        return currentOilModel;
    }

    public Document getCurrentOilPriceFromWebServices() throws ParserConfigurationException, SAXException, IOException {
        logging.info("getCurrentOilPriceFromWebServices()");
        // Call Web Service Operation
        com.pttplc.ptt_webservice.PTTInfo service = new com.pttplc.ptt_webservice.PTTInfo();
        com.pttplc.ptt_webservice.PTTInfoSoap port = service.getPTTInfoSoap12();
        // TODO initialize WS operation arguments here
        java.lang.String language = "";
        // TODO process result here
        java.lang.String result = port.currentOilPrice(language);
        logging.debug("Result = " + result);

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//        Document document = builder.parse(result);
        Document document = builder.parse(new InputSource(
                new ByteArrayInputStream(result.getBytes("utf-8"))));

//        System.out.println("document: " + document.getChildNodes().item(0).getNodeName());
        return document;
    }

    public CurrentOilModel convertXMLReesponseToModel(Document document) {
        logging.info("convertXMLReesponseToModel()");
        List<CurrentOilDataAccess> currentOilDataAccesses = new ArrayList<CurrentOilDataAccess>();

        NodeList nodeList = document.getElementsByTagName("DataAccess");

        logging.debug("nodeList.getLength() " + nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                CurrentOilDataAccess currentOilDataAccess = new CurrentOilDataAccess();
                currentOilDataAccess.setPriceDate(element.getElementsByTagName("PRICE_DATE").item(0).getTextContent());
                currentOilDataAccess.setProduct(element.getElementsByTagName("PRODUCT").item(0).getTextContent());

                NodeList priceNode = element.getElementsByTagName("PRICE");
                String price = priceNode.item(0) != null ? priceNode.item(0).getTextContent() : "-";

                currentOilDataAccess.setPrice(price);
                logging.debug("price " + currentOilDataAccess.toString());

                currentOilDataAccesses.add(currentOilDataAccess);
            }
        }

        CurrentOilModel currentOilModel = new CurrentOilModel();
        currentOilModel.setDataAccess(currentOilDataAccesses);

        return currentOilModel;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gable.enb.demo.webservices.soap.model;

/**
 *
 * @author goffity
 */
public class CurrentOilDataAccess {

    private String priceDate;
    private String product;
    private String price;

    @Override
    public String toString() {
        return "CurrentOilDataAccess{" + "priceDate=" + priceDate + ", product=" + product + ", price=" + price + '}';
    }

    /**
     * @return the priceDate
     */
    public String getPriceDate() {
        return priceDate;
    }

    /**
     * @param priceDate the priceDate to set
     */
    public void setPriceDate(String priceDate) {
        this.priceDate = priceDate;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }
}

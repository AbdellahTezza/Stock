package com.stock.Stock;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Prducts {

    private String name, marque;
    private int stock;
    private double prix;

            ;
    public Prducts( String name, String marque, int stock, double prix) {
        this.name = name;
        this.marque = marque;
        this.stock = stock;
        this.prix = prix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Prducts{" +
                "name='" + name + '\'' +
                ", marque='" + marque + '\'' +
                ", stock=" + stock +
                ", prix=" + prix +
                '}';
    }
}

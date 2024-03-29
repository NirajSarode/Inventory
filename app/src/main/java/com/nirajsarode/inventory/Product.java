package com.nirajsarode.inventory;

public class Product {
    private String name;
    private String type;
    private double cost;
    private double quantity;

    public Product(){

    }

    public Product(String name, String type, double cost, double quantity) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}

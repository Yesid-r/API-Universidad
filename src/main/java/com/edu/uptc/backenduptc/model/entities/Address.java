package com.edu.uptc.backenduptc.model.entities;

import java.io.Serializable;

public class Address implements Serializable {

    private String street;
    private String number;
    private String postalCode;

    private String dpto;
    private String floor;
    private String location;

    public  Address (){

    }
    public Address(String street, String number, String postalCode, String dpto, String floor, String location) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.dpto = dpto;
        this.floor = floor;
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", dpto='" + dpto + '\'' +
                ", floor='" + floor + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

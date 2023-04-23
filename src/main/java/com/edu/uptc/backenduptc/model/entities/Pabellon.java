package com.edu.uptc.backenduptc.model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pabellon implements Serializable {
    private Integer id;
    private double mt2;
    private Address address;
    private String name;
    private LocalDateTime dateUp;
    private LocalDateTime dateLatestUpdate;

    public Pabellon() {
    }

    public Pabellon(Integer id, double mt2, Address address, String name) {
        this.id = id;
        this.mt2 = mt2;
        this.address = address;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getMt2() {
        return mt2;
    }

    public void setMt2(double mt2) {
        this.mt2 = mt2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateUp() {
        return dateUp;
    }

    public void setDateUp(LocalDateTime dateUp) {
        this.dateUp = dateUp;
    }

    public LocalDateTime getDateLatestUpdate() {
        return dateLatestUpdate;
    }

    public void setDateLatestUpdate(LocalDateTime dateLatestUpdate) {
        this.dateLatestUpdate = dateLatestUpdate;
    }

    @Override
    public String toString() {
        return "Pabellon{" +
                "id=" + id +
                ", mt2=" + mt2 +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", dateUp=" + dateUp +
                ", dateLatestUpdate=" + dateLatestUpdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pabellon pabellon = (Pabellon) o;
        return id.equals(pabellon.id) && name.equals(pabellon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

package com.edu.uptc.backenduptc.model.entities;

import java.math.BigDecimal;

public class Teacher extends Person{

    private BigDecimal salary;

    public Teacher(Integer id, String firstName, String lastName, String dni, Address address) {
        super(id, firstName, lastName, dni, address);
    }

    public Teacher(Integer id, String firstName, String lastName, String dni, Address address, BigDecimal salary) {
        super(id, firstName, lastName, dni, address);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

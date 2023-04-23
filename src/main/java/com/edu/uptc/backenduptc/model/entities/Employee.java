package com.edu.uptc.backenduptc.model.entities;

import java.math.BigDecimal;

public class Employee extends Person {

    private BigDecimal salary;
    private TypeEmployee typeEmployee;

    public Employee(Integer id, String firstName, String lastName, String dni, Address address, BigDecimal salary, TypeEmployee typeEmployee) {
        super(id, firstName, lastName, dni, address);
        this.salary = salary;
        this.typeEmployee = typeEmployee;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}

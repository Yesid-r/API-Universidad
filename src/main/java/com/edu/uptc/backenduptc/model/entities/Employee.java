package com.edu.uptc.backenduptc.model.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "employees")

@PrimaryKeyJoinColumns({} )
public class Employee extends Person {

    private BigDecimal salary;
    @Column(name = "type_employee")
    @Enumerated(EnumType.STRING)
    private TypeEmployee typeEmployee;
    @OneToOne(optional = true,cascade = CascadeType.ALL)
    @JoinColumn(name="pabellon_id",
    foreignKey = @ForeignKey(name ="FK_PABELLON_ID"))
    private Pabellon pabellon;
    public Employee(Integer id, String firstName, String lastName, String dni, Address address, BigDecimal salary, TypeEmployee typeEmployee) {
        super(id, firstName, lastName, dni, address);
        this.salary = salary;
        this.typeEmployee = typeEmployee;
    }

    public Employee() {

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

    public Pabellon getPabellon() {
        return pabellon;
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    public void setPabellon(Pabellon pabellon) {
        this.pabellon = pabellon;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tEmployee{" +
                "salary=" + salary +
                ", typeEmployee=" + typeEmployee +
                '}';
    }
}

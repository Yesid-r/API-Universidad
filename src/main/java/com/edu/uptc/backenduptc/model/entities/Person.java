package com.edu.uptc.backenduptc.model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Person implements Serializable {

    private Integer id;
    private String firstName;
    private String lastName;

    private String dni;
    private LocalDateTime dateUp;
    private LocalDateTime dateUpdate;
    private Address address;

    public Person(Integer id, String firstName, String lastName, String dni, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDateTime getDateUp() {
        return dateUp;
    }

    public void setDateUp(LocalDateTime dateUp) {
        this.dateUp = dateUp;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", dateUp=" + dateUp +
                ", dateUpdate=" + dateUpdate +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) && dni.equals(person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dni);
    }
}

package com.edu.uptc.backenduptc.model.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "pabellones")
public class Pabellon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "metros_cuadrados")
    private double mt2;
    @Embedded
    private Address address;
    @Column(name = "name_pabellon", unique = true, nullable = false)
    private String name;
    @Column(name = "date_up")
    private LocalDateTime dateUp;
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
    @OneToMany(mappedBy = "pabellon", fetch = FetchType.LAZY)
    private Set<Classroom> classrooms;

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

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Set<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Set<Classroom> classrooms) {
        this.classrooms = classrooms;
    }
    @PrePersist
    public void beginPersist(){
        this.dateUp = LocalDateTime.now();

    }
    @PreUpdate
    public void beginUpdatePersist(){
        this.dateUpdate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Pabellon{" +
                "id=" + id +
                ", mt2=" + mt2 +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", dateUp=" + dateUp +
                ", dateLatestUpdate=" + dateUpdate +
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

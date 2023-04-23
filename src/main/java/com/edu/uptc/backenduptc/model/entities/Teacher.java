package com.edu.uptc.backenduptc.model.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "Teachers")
@PrimaryKeyJoinColumns({})
public class Teacher extends Person{

    private BigDecimal salary;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name="teacher_course", joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;

    public Teacher(Integer id, String firstName, String lastName, String dni, Address address) {
        super(id, firstName, lastName, dni, address);
    }

    public Teacher(Integer id, String firstName, String lastName, String dni, Address address, BigDecimal salary) {
        super(id, firstName, lastName, dni, address);
        this.salary = salary;
    }

    public Teacher() {

    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tTeacher{" +
                "salary=" + salary +
                ", courses=" + courses +
                '}';
    }
}

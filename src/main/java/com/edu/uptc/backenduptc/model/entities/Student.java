package com.edu.uptc.backenduptc.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
@PrimaryKeyJoinColumns({})
public class Student extends Person{
    @ManyToOne(optional = true,
    cascade = {CascadeType.PERSIST,
    CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    public Student(Integer id, String firstName, String lastName, String dni, Address address) {
        super(id, firstName, lastName, dni, address);
    }

    public Student() {

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tStudent{" +
                "course=" + course +
                '}';
    }
}

package com.edu.uptc.backenduptc.model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Course implements Serializable {

    private Integer id;
    private String name;
    private Integer numberYears;
    private Integer numberSubjects;

    private LocalDateTime dateUp;
    private LocalDateTime dateUpdate;

    public Course() {
    }

    public Course(Integer id, String name, Integer numberYears, Integer numberSubjects) {
        this.id = id;
        this.name = name;
        this.numberYears = numberYears;
        this.numberSubjects = numberSubjects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberYears() {
        return numberYears;
    }

    public void setNumberYears(Integer numberYears) {
        this.numberYears = numberYears;
    }

    public Integer getNumberSubjects() {
        return numberSubjects;
    }

    public void setNumberSubjects(Integer numberSubjects) {
        this.numberSubjects = numberSubjects;
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberYears=" + numberYears +
                ", numberSubjects=" + numberSubjects +
                ", dateUp=" + dateUp +
                ", dateUpdate=" + dateUpdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id.equals(course.id) && name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

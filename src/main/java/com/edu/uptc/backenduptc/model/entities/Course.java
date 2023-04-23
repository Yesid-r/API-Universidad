package com.edu.uptc.backenduptc.model.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 80)
    private String name;
    @Column(name = "number_years")
    private Integer numberYears;

    @Column(name = "number_subjects")
    private Integer numberSubjects;

    @Column(name = "date_up")
    private LocalDateTime dateUp;
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private Set<Student>students;
    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<Teacher> teachers;

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
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberYears=" + numberYears +
                ", numberSubjects=" + numberSubjects +
                ", dateUp=" + dateUp +
                ", dateUpdate=" + dateUpdate +
                '}';
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
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

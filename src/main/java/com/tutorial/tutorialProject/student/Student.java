package com.tutorial.tutorialProject.student;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence"
            , sequenceName = "student_sequence"
            , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "student_sequence")
    private Long Id;

    @Column
    private String name;
    @Column
    private String Email;

    @Transient
    private Integer age;

    public Integer getAge() {
        return Period.between(LocalDate.of(1991, 1, 1), LocalDate.now()).getYears();
    }

    public Student() {
    }

    public Student(Long id, String name, String email) {
        Id = id;
        this.name = name;
        Email = email;
    }

    public Student(String name, String email) {
        this.name = name;
        Email = email;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

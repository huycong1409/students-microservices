package com.cong.springsmstudentsservice.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "class")
public class Clazz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String className;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clazz")
    private Set<Student> studentSet = new HashSet<>();

    public Clazz() {

    }

    public Clazz(int id, String className, Set<Student> studentSet) {
        this.id = id;
        this.className = className;
        this.studentSet = studentSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}

package com.example.corsojava.domain;

import javax.persistence.Id;
import java.util.List;

public class Department {

    @Id
    private String id;
    private String name;
    private List<Student> students;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

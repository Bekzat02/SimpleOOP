package com.company;

import java.util.ArrayList;

public class StudentsGroup {
    private String name;
    private ArrayList<Person> students;

    public StudentsGroup(String name) {
        students = new ArrayList<>();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Person student) {
        students.add(student);
    }

    public ArrayList<Person> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}

package org.launchcode.Ch14Lecture.models;

public class Student {
    private int id;
    private static int nextId = 1;

    private String firstName;
    private String lastName;
    private String taGroup;

    public Student() {
        id = nextId;
        nextId++;
    }

    public Student(String firstName, String lastName, String taGroup) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.taGroup = taGroup;
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

    public String getTaGroup() {
        return taGroup;
    }

    public void setTaGroup(String taGroup) {
        this.taGroup = taGroup;
    }

    public int getId() {
        return id;
    }
}

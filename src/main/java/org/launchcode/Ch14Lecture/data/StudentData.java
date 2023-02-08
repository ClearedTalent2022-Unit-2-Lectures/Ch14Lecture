package org.launchcode.Ch14Lecture.data;

import org.launchcode.Ch14Lecture.models.Student;

import java.util.ArrayList;

public class StudentData {
    // This is a stand-in database
    // Once we are done, this class will contain a collection
    // to store Student objects as well as methods to work with
    // this collection

    // Let's make an ArrayList in which we can store Student
    // objects!
    public static ArrayList<Student> allStudents = new ArrayList();

    // Let's create a method that will allow us to take a Student
    // object and add it into this allStudents ArrayList
    // Input(s): Student object
    // Output(s):
    public static void addStudent(Student studentObj) {
        // method body
        // allStudents.push(studentObj);
        allStudents.add(studentObj);
    }

    // It is best practice to create method that gives us access
    // to the allStudents ArrayList instead of referencing directly
    public static ArrayList<Student> getAllStudents() {
        return allStudents;
    }

}

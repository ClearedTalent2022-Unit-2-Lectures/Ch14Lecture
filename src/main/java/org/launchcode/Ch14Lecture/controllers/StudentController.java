package org.launchcode.Ch14Lecture.controllers;

import org.launchcode.Ch14Lecture.data.StudentData;
import org.launchcode.Ch14Lecture.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("allStudents", StudentData.getAllStudents());
        return "student/index";
    }

    @GetMapping("add")
    public String addStudentForm() {
        return "student/add";
    }

    @PostMapping("add")
    public String handleAddStudentSubmit(Model model, String firstName, String lastName, String taGroup) {
        // CRUD
        // Let's create a new Student object using the data from the
        // Add Student form
        Student newStudent = new Student(firstName, lastName, taGroup);
        // Let's use our newly created ArrayList and add method to
        // store this newStudent object in our application
        StudentData.addStudent(newStudent);

        // Since we want to display all of the Students stored in the
        // StudentData class on the student/index view, we need to pass
        // all of the students to the view
        model.addAttribute("allStudents", StudentData.getAllStudents());

        return "student/index";
    }

}

package org.launchcode.Ch14Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public String index() {
        return "student/index";
    }

    @GetMapping("add")
    public String addStudentForm() {
        return "student/add";
    }

    @PostMapping("add")
    public String handleAddStudentSubmit() {
        return "student/index";
    }

}

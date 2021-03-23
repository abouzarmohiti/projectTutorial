package com.tutorial.tutorialProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {

    @Value("${baby.name:No found name}")
    String nameBache;

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> hello() {
        return studentService.finds();
    }

    @GetMapping("baby")
    public String babyName(){
        return nameBache;
    };
}

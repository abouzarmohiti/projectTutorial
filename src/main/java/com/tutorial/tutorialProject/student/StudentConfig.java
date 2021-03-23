package com.tutorial.tutorialProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student abazar = new Student("abazar","Mohiti");
            Student ali = new Student("ali","mohammadi");
            List<Student> students = new ArrayList<>();
            students.add(abazar);
            students.add(ali);
            repository.saveAll(students);
        };
    };
}

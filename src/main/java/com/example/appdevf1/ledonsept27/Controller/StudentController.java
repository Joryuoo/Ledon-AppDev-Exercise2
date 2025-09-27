package com.example.appdevf1.ledonsept27.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appdevf1.ledonsept27.Entity.Student;
import com.example.appdevf1.ledonsept27.Service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @GetMapping   
    public List<Student> displayAllStudents(){
        return studentService.getAllStudent();
    }
}

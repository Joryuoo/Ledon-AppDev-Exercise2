package com.example.appdevf1.ledonsept27.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.appdevf1.ledonsept27.Entity.Student;
import com.example.appdevf1.ledonsept27.Repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student insertStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

}

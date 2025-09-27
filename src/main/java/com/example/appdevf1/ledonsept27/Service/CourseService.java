package com.example.appdevf1.ledonsept27.Service;
//for business logic ana maam barbaso
// controller -> services -> repository

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.appdevf1.ledonsept27.Entity.Course;
import com.example.appdevf1.ledonsept27.Repository.CourseRepository;



@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public Course insertCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }
}

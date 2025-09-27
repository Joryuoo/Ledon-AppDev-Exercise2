package com.example.appdevf1.ledonsept27.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appdevf1.ledonsept27.Entity.Course;
import com.example.appdevf1.ledonsept27.Service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping   
    public Course addCourse(@RequestBody Course course){
        return courseService.insertCourse(course);
    }

    @GetMapping 
    public List<Course> displayAllCourse(){
        return courseService.getAllCourse();
    }
}

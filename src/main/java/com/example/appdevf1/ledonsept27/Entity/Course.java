package com.example.appdevf1.ledonsept27.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblCourse")
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int course_id;

    @Column(name="description")
    private String description;

    @Column(name="units")
    private int units;

    public Course(){}
    public Course(String description, int units){
        this.description = description;
        this.units = units;
    }

    //setter and getter

    public int getCourseId(){
        return course_id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setUnits(int units){
        this.units = units;
    }

    public String getDescription(){
        return this.description;
    }

    public int getUnits(){
        return this.units;
    }
}

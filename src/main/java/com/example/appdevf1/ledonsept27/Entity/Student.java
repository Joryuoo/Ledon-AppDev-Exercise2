package com.example.appdevf1.ledonsept27.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tblStudent")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int student_id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "program")
    private String program;

    @Column(name = "yearlevel")
    private int yearLevel;

    public Student(){}

    public Student(String firstname, String lastname, String program, int yearLevel){
        this.firstname = firstname;
        this.lastname = lastname;
        this.program = program;
        this.yearLevel = yearLevel;
    }

    //setter and getter methods

    public int getStudent_id(){
        return this.student_id;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public int getYearLevel(){
        return this.yearLevel;
    }

    public String getProgram(){
        return this.program;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }

}

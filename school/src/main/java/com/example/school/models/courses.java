package com.example.school.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class courses {
    private ArrayList<String> courses;
    private ArrayList<String> ques;

    @JsonIgnore
    private long id;
    @JsonIgnore
    private int studentId;

    public courses(){

    }

    public courses(ArrayList<String> ques,ArrayList<String> courses,int studentId) {
        this.courses = courses;
        this.studentId = studentId;
        this.ques = ques;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "studentid", nullable = false)
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Column(name = "courses", nullable = false)
    @Convert(converter = StringListConverter.class)
    public ArrayList<String> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Column(name = "questions", nullable = false)
    @Convert(converter = StringListConverter.class)
    public ArrayList<String> getQues() {
        return ques;
    }
    public void setQues(ArrayList<String> ques) {
        this.ques = ques;
    }
}

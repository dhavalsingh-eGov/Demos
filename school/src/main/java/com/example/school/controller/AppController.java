package com.example.school.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.school.interfaces.*;
import com.example.school.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@RestController
@RequestMapping
public class AppController {

    @Autowired
    private studentdb studentdb;

    @Autowired
    private coursesdb coursesdb;

    @RequestMapping(value = "/api/v1/student/register", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody students inputPayload) throws Exception {
        studentdb.save(inputPayload);
        return new ResponseEntity<>("Student Registered Succesfully", HttpStatus.valueOf(200));
    }

    @RequestMapping(value = "/api/v1/{id}/assign", method = RequestMethod.POST)
    public ResponseEntity assignCourses(@RequestBody courses input,@PathVariable int id) {
        courses user = new courses();
        user.setCourses(input.getCourses());
        user.setQues(input.getQues());
        user.setStudentId(id);
        coursesdb.save(user);
        return new ResponseEntity<>("Course assigned Succesfully", HttpStatus.valueOf(200));
    }

    @GetMapping("/api/v1/{id}/courses")
    public ResponseEntity getUsers(@PathVariable Long id) {
     //   courses user = new courses();
         Optional<courses> ans = coursesdb.findById(id);
        return ResponseEntity.ok().body(ans);

    }


}

package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addstudent")
    public student addstudent(@RequestBody student st){
        return stdser.postStudent(st);

    }
}
package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.student;
@RestController
public class StudentController{
    @PostMapping("/addstudent")
    public student addstudent(@RequestBody student st){
        return 

    }
}
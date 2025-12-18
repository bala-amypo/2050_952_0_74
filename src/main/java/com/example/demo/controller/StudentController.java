package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // CREATE
    @PostMapping("postst")
    public Student createStudent(@RequestBody Student student) {
        return service.postStudent(student);
    }

    // READ ALL
    @GetMapping("getst")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // READ BY ID
    @GetMapping("getst/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Long id,@RequestBody Student st) {
        return service.updateStudent(id, st);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted with id: " + id;
    }
}

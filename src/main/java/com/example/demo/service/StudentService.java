//studentservice
package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.student;
public interface StudentService {
    student poststudent(student st);
    List<student> getAllStudents();
}
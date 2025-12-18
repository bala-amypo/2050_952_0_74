package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;
import java.util.Optional;
public interface StudentService {

    Student postStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    String updateStudent(Long id, Student st);

    void deleteStudent(Long id);
}

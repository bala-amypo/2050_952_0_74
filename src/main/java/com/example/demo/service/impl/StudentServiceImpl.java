package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student postStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {

        Optional<Student> optionalStudent = repository.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(studentDetails.getName());
            existingStudent.setDept(studentDetails.getDept());
            existingStudent.setDob(studentDetails.getDob());
            existingStudent.setCgpa(studentDetails.getCgpa());

            return repository.save(existingStudent);
        }

        return null; 
    }


    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}

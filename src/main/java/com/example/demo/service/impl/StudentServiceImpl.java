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
    public Student postStudent(Student st) {
        return repository.save(st);
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
    public String updateStudent(Long id,Student st){
    boolean status=repository.existsById(id);
    if(status){
      st.setId(id);
      repository.save(st);
      return "Student updated successfully ";

    }
    else{
    return "Student with ID "+id+ "not found";
    }
    }
    
    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}

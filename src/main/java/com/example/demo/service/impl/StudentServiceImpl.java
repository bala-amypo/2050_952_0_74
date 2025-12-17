package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository stdrepo;

    @Override
    public Student postStudent(Student st) {
        return stdrepo.save(st);
    }

    @Override
    public List<Student> getAllStudents() {
        return stdrepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return stdrepo.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student st) {
        Student existing = stdrepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(st.getName());
            existing.setAge(st.getAge());
            return stdrepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        stdrepo.deleteById(id);
    }
}

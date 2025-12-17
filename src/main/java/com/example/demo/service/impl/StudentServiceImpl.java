package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    
    StudentRepository stdreps;
    @Override
    public student poststudent(student st){
        return stdrepo.save(st);
        

    }

}
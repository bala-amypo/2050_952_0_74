package com.example.demo.repository;
import org.springframework.data.jpa.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.student;
@Repository
public interface StudentRepository extends JpaRepository<student,Long>{

}
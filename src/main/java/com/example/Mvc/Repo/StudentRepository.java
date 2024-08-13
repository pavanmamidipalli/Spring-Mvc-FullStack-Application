package com.example.Mvc.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mvc.Entity.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Integer> {

}

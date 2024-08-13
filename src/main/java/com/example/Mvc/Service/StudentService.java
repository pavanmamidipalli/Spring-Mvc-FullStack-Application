package com.example.Mvc.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mvc.Entity.StudentDetails;
import com.example.Mvc.Repo.StudentRepository;

@Service
public class StudentService implements IStudentService{
    @Autowired
	private StudentRepository studentRepository;
	public List<StudentDetails> StudentDetails() {
	
		return (List<StudentDetails>) studentRepository.findAll();
	}
	@Override
	public void addDetails(StudentDetails studentDetails) {
		studentRepository.save(studentDetails);
		
	}
	@Override
	public void deletedata(Integer id) {
		studentRepository.deleteById(id);
		
	}
	@Override
	public StudentDetails update(Integer id) {
		Optional obj = studentRepository.findById(id);
		return (StudentDetails)obj.get();
	}
}

package com.example.Mvc.Service;

import java.util.List;

import com.example.Mvc.Entity.StudentDetails;

public interface IStudentService {
	public List<StudentDetails> StudentDetails();
	public void addDetails(StudentDetails studentDetails);
	public void deletedata(Integer id);
	public StudentDetails update(Integer id);

}

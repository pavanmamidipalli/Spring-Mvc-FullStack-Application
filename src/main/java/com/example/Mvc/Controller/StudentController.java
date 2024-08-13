package com.example.Mvc.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Mvc.Entity.StudentDetails;
import com.example.Mvc.Service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService iStudentService;
	@RequestMapping("/information")
	public String getDetails(Map<String,Object> model) {
		List<StudentDetails> studentDetails = iStudentService.StudentDetails();
		System.out.println(studentDetails.toString());
		model.put("details", studentDetails);
		
		return "index";
	}
	@RequestMapping("/showform")
	public String showform(Map<String,Object> model) {
       StudentDetails studentDetails = new StudentDetails();
		model.put("details", studentDetails);
		
		return "showform";
	}
	@PostMapping("/studentregister")
	public String register(@ModelAttribute("studentDetails")StudentDetails studentDetails,Map<String,Object> model) {
      
	iStudentService.addDetails(studentDetails);
		
		return "redirect:/information";
	}
	@GetMapping("/update")
	public String updatedata(@RequestParam("studentid")Integer id,Map<String,Object> model) {
      
	StudentDetails studentDetials=iStudentService.update(id);
		model.put("details", studentDetials);
		return "showform";
	}
	@GetMapping("/delete")
	public String remove(@RequestParam("studentid")Integer id) {
      iStudentService.deletedata(id);
		
		return "redirect:/information";
	}

}

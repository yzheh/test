package com.ht.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ht.pojo.Student;
import com.ht.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/hello.html")
	public String hello(HttpSession session){
		List<Student> list = studentService.selectAll();
		Student student = new Student();
		student = list.get(0);
		String name = student.getStudentName();
		String a = StringUtils.left(name, 4)+"***"+StringUtils.right(name, name.length()-4-3);
		student.setStudentName(a);
		session.setAttribute("Stuent", student);
		return "Hello";
	}
}

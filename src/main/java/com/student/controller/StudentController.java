package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.dao.StudentDAO;
import com.student.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO studentDAO;
	@RequestMapping("/")
	 public String listCustomers(Model theModel) {
       List<Student> list = studentDAO.getList();
        theModel.addAttribute("list", list);
        return "index";
	}
}

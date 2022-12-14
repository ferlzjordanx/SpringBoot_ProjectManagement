package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.ProjectRepository;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Project;

@Controller
public class HomeController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		
		List<Project> projects = proRepo.findAll();
		
		List<Employee> employees = empRepo.findAll();
		
		model.addAttribute("projectsList", projects);
		
		model.addAttribute("employeesList", employees);
		
		return "main/home";
		
	}

}

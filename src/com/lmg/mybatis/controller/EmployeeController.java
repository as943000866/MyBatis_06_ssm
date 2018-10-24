package com.lmg.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmg.mybatis.bean.Employee;
import com.lmg.mybatis.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("getemps")
	public String emps(Map<String, Object> map){
		
		List<Employee> emps = employeeService.getEmps();
		map.put("ALLEmps", emps);
		return "list";
	}
}

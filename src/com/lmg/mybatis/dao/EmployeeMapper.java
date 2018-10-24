package com.lmg.mybatis.dao;

import java.util.List;

import com.lmg.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	 public Employee getEmpById(Integer id); 
	 
	 public List<Employee> getEmps();
}

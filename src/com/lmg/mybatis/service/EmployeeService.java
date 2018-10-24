package com.lmg.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmg.mybatis.bean.Employee;
import com.lmg.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SqlSession sqSession;
	public List<Employee> getEmps(){
		//批量操作相关的代码
		return employeeMapper.getEmps();
	}
}

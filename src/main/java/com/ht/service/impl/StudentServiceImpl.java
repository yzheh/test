package com.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.StudentMapper;
import com.ht.pojo.Student;
import com.ht.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectAll();
	}

}

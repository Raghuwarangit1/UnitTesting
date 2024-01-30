package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDao;
import com.nt.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
private StudentDao dao;
	@Override
	public Boolean save(Student s) {
	
		return dao.save(s);
	}

	@Override
	public Student findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findStudentById(id);
	}

}

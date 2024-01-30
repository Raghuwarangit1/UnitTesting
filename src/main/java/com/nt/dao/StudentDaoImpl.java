package com.nt.dao;

import org.springframework.stereotype.Repository;

import com.nt.entity.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public Boolean save(Student s) {
		if(s==null)
			return false;
		return true;
	}

	@Override
	public Student findStudentById(Integer id) {
	
		return new Student(id,"raghu");
	}

}

package com.nt.service;

import com.nt.entity.Student;

public interface StudentService {
	public Boolean save(Student s);
	public Student findStudentById(Integer id);
}

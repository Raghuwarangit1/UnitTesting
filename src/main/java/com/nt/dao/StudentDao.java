package com.nt.dao;

import com.nt.entity.Student;

public interface StudentDao {
public Boolean save(Student s);
public Student findStudentById(Integer id);
}

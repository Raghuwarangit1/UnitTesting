package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.nt.dao.StudentDao;
import com.nt.entity.Student;
@SpringBootTest
public class DaoTest {
	@Autowired
	private StudentDao dao;
		@Test
	public	void save() {
	
			Boolean save = dao.save(new Student(6,"wardhan"));
			assertEquals(true, save);
		
		}
		public	void save1() {
		
			Boolean save = dao.save(new Student(6,"wardhan"));
			assertEquals(false, save);
		
		}
		@Test
		public void find() {
			//when(dao.findStudentById(1)).thenReturn(new Student(1,"raghu"));
		Student student = dao.findStudentById(1);
		assertNotNull(student);
		}
}

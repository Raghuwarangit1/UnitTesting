package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.nt.dao.StudentDao;
import com.nt.entity.Student;
import com.nt.service.StudentService;
import com.nt.service.StudentServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	@ MockBean
	private StudentDao dao;
	@InjectMocks
private StudentServiceImpl service;
	@Test
public void save() {
	when(dao.save(new Student(2,"vipul"))).thenReturn(true);
	Boolean save = service.save(new Student(2,"vipul"));
	assertEquals(true, save);

}
	@Test
	public void find() {
		when(dao.findStudentById(2)).thenReturn(new Student(9,"madhu"));
		
		Student id = service.findStudentById(2);
		
		assertNotNull(id);
	}
}

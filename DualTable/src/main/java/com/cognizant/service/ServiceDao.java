package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Student;

public interface ServiceDao {
	public int insert(Student student);
	   public int update(Student student);
	   public int delete(Student student);
	   public List<Student> findAll(); 
}

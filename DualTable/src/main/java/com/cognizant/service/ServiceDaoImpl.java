package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.daoImpl.AddressDao;
import com.cognizant.daoImpl.AddressDaoImpl;
import com.cognizant.daoImpl.StudentDao;
import com.cognizant.daoImpl.StudentDaoImpl;
import com.cognizant.model.Address;
import com.cognizant.model.Student;

@Service
public class ServiceDaoImpl implements ServiceDao {
	@Autowired
	private StudentDao studentDao=new StudentDaoImpl();
	@Autowired
	private AddressDao addressDao=new AddressDaoImpl();

	@Override
	public int insert(Student student) {
		int add=studentDao.insert(student);
		int res=addressDao.insert(student.getAddress());
		if(add>0 && res>0)
			return 1;
		else
			return 0;
	}

	@Override
	public int update(Student student) {
		return studentDao.update(student);
	}

	@Override
	public int delete(Student student) {
		return studentDao.delete(student);
	}

	@Override
	public List<Student> findAll() {
		List<Student> list1=studentDao.findAll();
		List<Address> list2=addressDao.findAll();
		List<Student> ls=new ArrayList<>();
		for (Student student : list1) {
			if (student.getAddress().getHouseno() == null) {
				student.getAddress().setHouseno("-");
				student.getAddress().setCity("-");
			} else {
				for (Address add : list2) {
					if (add.getHouseno().equals(student.getAddress().getHouseno())) {
						student.getAddress().setCity(add.getCity());
						break;
					}
				}
			}
			ls.add(student);
		}
		return ls;
	}
}


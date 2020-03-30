package com.cognizant.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Address;
import com.cognizant.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private AddressDao addressDao;
	
	@Override
	public int insert(Student student) {
		String sql="insert into Student values(?,?,?,?)";
		int result=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getCourse(),student.getAddress().getHouseno());
		return result;
	}

	@Override
	public int update(Student student) {
		String sql="update Student set name=?,houseNo=? where id=?";
		List<Address> ls=addressDao.findAll();
		int flag=0;
		for(Address add:ls)
		{
			if(add.getHouseno().equals(student.getAddress().getHouseno())){
			int result=jdbcTemplate.update(sql,student.getName(),student.getAddress().getHouseno(),student.getId());
			flag=1;
			}
		}
		return flag;
	}

	@Override
	public int delete(Student student) {
		String sql="delete from Student where id=?";
		int result=jdbcTemplate.update(sql,student.getId());
		return result;
	}

	@Override
	public List<Student> findAll() {
		String query = "select * from Student";
		return jdbcTemplate.query(
				query, 
				(rs, rowNum) -> new Student(rs.getString(1), rs.getString(2), rs.getString(3),new Address(rs.getString(4))));

	}

	}


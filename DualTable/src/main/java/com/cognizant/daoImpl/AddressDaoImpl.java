package com.cognizant.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Address;

@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Address address) {
		String sql="insert into Address values(?,?)";
		int result=jdbcTemplate.update(sql,address.getHouseno(),address.getCity());
		return result;
	}

	/*@Override
	public int update(Address address) {
		String sql="update Address set city=? where houseNo=?";
		int result=jdbcTemplate.update(sql,address.getCity(),address.getHouseno());
		return result;
	}

	@Override
	public int delete(Address address) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	@Override
	public List<Address> findAll() {
		String sql="select * from Address";
		return jdbcTemplate.query(sql,(rs, rownum)-> new Address(rs.getString(1),(rs.getString(2))));
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

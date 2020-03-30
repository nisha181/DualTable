package com.cognizant.daoImpl;

import java.util.List;

import com.cognizant.model.Address;

public interface AddressDao {
	   public int insert(Address address);
	   //public int update(Address address);
	   //public int delete(Address address);
	   public List<Address> findAll(); 
}

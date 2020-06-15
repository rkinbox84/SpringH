package com.rk.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rk.bean.Address;

public class AddressDAO {
	
	private JdbcTemplate jdbcTemplate;  
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}
	
	public void readAddress() {
		String SQL = "SELECT * FROM rkspring.addressTbl";
	      @SuppressWarnings("unchecked")
		List <Address> addressList = jdbcTemplate.query(SQL, new AddressMapper());
	      
	      for(Address a: addressList) {
	    	  
	    	  System.out.println(a);
	      }
	}

}

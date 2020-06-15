package com.rk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rk.bean.Address;

public class AddressMapper implements RowMapper<Address> {
	   public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Address address = new Address();
		   address.setEmpId(rs.getString("empId"));
		   address.setArea(rs.getString("area"));
		   address.setCity(rs.getString("city"));
		   address.setState(rs.getString("state"));
		     
		      return address;
		   }

}

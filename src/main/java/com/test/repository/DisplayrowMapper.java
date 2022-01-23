package com.test.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.bean.Displaypojo;

public class DisplayrowMapper implements RowMapper<Displaypojo> {

	@Override
	public Displaypojo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Displaypojo display=new Displaypojo();
		display.setAccno(rs.getString("accno"));
		display.setAcctype(rs.getString("acctype"));
		display.setBalance(rs.getDouble("balance"));
		display.setCname(rs.getString("cname"));
		display.setCustid(rs.getString("custid"));
		display.setDob(rs.getString("dob"));
		display.setEmail(rs.getString("email"));
		
		return display;
	}

}

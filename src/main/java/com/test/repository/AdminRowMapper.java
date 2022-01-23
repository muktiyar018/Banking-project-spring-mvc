package com.test.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.bean.AdminLoginPojo;


public class AdminRowMapper implements RowMapper<AdminLoginPojo> {

	@Override
	public AdminLoginPojo mapRow(ResultSet rs, int rowNum) throws SQLException {
		AdminLoginPojo admin=new AdminLoginPojo();
	    admin.setAdminid(rs.getString("adminid"));
	    admin.setAdminpass(rs.getString("adminpass"));
		return admin;
	}

}

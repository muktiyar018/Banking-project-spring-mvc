package com.test.bean;

import org.springframework.stereotype.Component;

@Component
public class AdminLoginPojo {

	private String adminid;
	private String adminpass;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}
	
}

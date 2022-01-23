package com.test.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.bean.Displaypojo;

@Repository
public class DbImplement{ 
	@Autowired
	JdbcTemplate jdbctemp;

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	public boolean adminlog(String aid, String apass) {
		String sql="select exists(select adminid,adminpass from adminlogin where adminid=? and adminpass=?)";
		boolean admin=jdbctemp.queryForObject(sql, new Object[] {aid,apass},Boolean.class);
		return admin;
	}

	public boolean userlog(String uid, String upass) {
		String sql="select exists(select custid,custpass from userlogin where custid=? and custpass=?)";
		boolean user=jdbctemp.queryForObject(sql, new Object[] {uid,upass},Boolean.class);
		return user;
	}
	public List<Displaypojo> displaydata(){
		String sql="SELECT c.accno,c.acctype,c.balance,cd.custid,cd.cname,cd.dob,cd.email from customers c,custdetails cd where c.custid=cd.custid";
		List<Displaypojo> list=jdbctemp.query(sql, new DisplayrowMapper());
		return list;
	}

	public boolean insertcust(String uid, String uname, String dob, String email, String upass) {
		
			try {
				String sql="INSERT INTO custdetails values(?,?,?,?)";
				String sql1="INSERT INTO userlogin values(?,?)";
		int q1=jdbctemp.update(sql,new Object[] {uid,uname,dob,email});
		int q2=jdbctemp.update(sql1,new Object[] {uid,upass});
		return true;}catch(DataIntegrityViolationException e) {
			System.out.println("In exception");
			return false;
		}
		
		
	}

	public boolean accclosed(String accno) {
		String sql="select exists(select accno from customers where accno=?)";
		String sql1="DELETE from customers WHERE accno=?";
		if(jdbctemp.queryForObject(sql, new Object[] {accno},Boolean.class)) {
			jdbctemp.update(sql1,accno);
			return true;
		}
		return false;
	}

	public boolean accopened(String accno, String custid, String acctype, double balance) {
		String sql="INSERT INTO customers values(?,?,?,?)";
		int q1=jdbctemp.update(sql,new Object[] {accno,custid,acctype,balance});
		return q1>0;
	}

	public List<Displaypojo> displaycustdata(String custid) {
		String sql="SELECT c.accno,c.acctype,c.balance,cd.custid,cd.cname,cd.dob,cd.email from banking.customers c,banking.custdetails cd where c.custid=cd.custid and c.custid=?;";
		List<Displaypojo> list=jdbctemp.query(sql,new Object[] {custid},new DisplayrowMapper());
		return list;
	}

	public boolean accdeposit(String accno, double balance) {
		String sql="select exists(SELECT accno from customers where accno=?)";
		String sql1="UPDATE customers SET balance=balance+? WHERE accno=?";
		if(jdbctemp.queryForObject(sql, new Object[] {accno},Boolean.class)) {
			jdbctemp.update(sql1,balance,accno);
			return true;
		}
		return false;
	}

	public boolean accwithdraw(String accno, double balance) {
		String sql="select exists(SELECT accno from customers where accno=?)";
		String sql1="UPDATE customers SET balance=balance-? WHERE accno=?";
		if(jdbctemp.queryForObject(sql, new Object[] {accno},Boolean.class)) {
			jdbctemp.update(sql1,balance,accno);
			return true;
		}
		return false;
	}
	
	public boolean acctransfer(String accno1, String accno2,double balance) {
		String sql="select exists(SELECT accno from customers where accno=?)";
		String sql1="select exists(SELECT accno from customers where accno=?)";
		String sql2="UPDATE customers SET balance=balance+? WHERE accno=?";
		String sql3="UPDATE customers SET balance=balance-? WHERE accno=?";
		boolean res1=jdbctemp.queryForObject(sql, new Object[] {accno1},Boolean.class);
		boolean res2=jdbctemp.queryForObject(sql1, new Object[] {accno2},Boolean.class);
		if(res1&&res2) {
			jdbctemp.update(sql2,balance,accno2);
			jdbctemp.update(sql3,balance,accno1);
			return true;
		}
		return false;
	}
}
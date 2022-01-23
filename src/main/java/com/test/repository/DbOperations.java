package com.test.repository;

import java.sql.ResultSet;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.bean.AdminLoginPojo;

@Repository
public interface DbOperations extends CrudRepository<AdminLoginPojo, Integer> {

@Query("select adminid,adminpass from adminlogin where adminid= :aid and adminpass= :apass")
public ResultSet result(@Param("aid") String aid,@Param("apass") String apass);
	
}

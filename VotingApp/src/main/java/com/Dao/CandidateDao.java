package com.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.Candidate;

public class CandidateDao {
	
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	
	public void insertc(String cname)
	{
		jt.update("insert into candidate values(?)", cname);
	}
	
	public int getCCount()
	{
		List<Candidate> l = jt.query("select * from candidate",new CandidateRowMapper());
		return l.size();
	}
	
	
	public void deleteAllC()
	{
		jt.update("truncate table candidate");
	}
	
	public List<Candidate> readAllC()
	{
		return jt.query("select * from candidate",new CandidateRowMapper());
	}
	

}















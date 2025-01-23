package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class VoteDao {
	
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int addVote(String cname, String uname)
	{
		try
		{
			return jt.update("insert into vote values(?,?)", cname, uname);
		}
		catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public void deleteVotes()
	{
		jt.update("truncate table vote");
	}
}

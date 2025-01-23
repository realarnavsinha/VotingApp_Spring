package com.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.User;

public class UserDao {	
//	String res="";
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void addUser(String id, String pass, String age) {

/*int r=*/	jt.update("insert into user values(?,?,?)", id, pass, age);
//		if(r==1) {
//			res="Inserted";
//		}
//		
//		else {
//			res="Failed";
//		}		
	}


	public String checkUser(String id, String pass) {
		
		String res="";
		List<User> l = jt.query("select * from user", new UserRowMapper());
		
		for(int i=0;i<l.size();i++) {
		
			if(l.get(i).getUsername().equals(id) && l.get(i).getPassword().equals(pass)) {
				
				res="exists";
				break;
			}
			
			else {
				res="not exists";
			}
		}
		
		return res;
	}	
}
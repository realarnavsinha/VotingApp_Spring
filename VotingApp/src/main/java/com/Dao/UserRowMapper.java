package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User u = new User();
		u.setUsername(rs.getString(1));
		u.setPassword(rs.getString(2));
		u.setAge(rs.getString(3));
		
		return u;
	}
	
	
}

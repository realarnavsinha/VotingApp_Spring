package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Model.Candidate;

public class CandidateRowMapper  implements RowMapper<Candidate>
{

	@Override
	public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		Candidate c = new Candidate();
		c.setCname(rs.getString(1));
		return c;
	}

}

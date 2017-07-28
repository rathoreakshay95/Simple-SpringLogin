/**
 * 
 */
package org.govind.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.govind.model.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author golu
 *
 */

@Repository
public class DaoImpl implements Dao{

	@Autowired
	JdbcTemplate jdbcTemplete;
	
	@Override
	public List<LoginBean> validate(String id, String password) {
		String query = "select * from login where id='"+id+"'";
		List<LoginBean> list = jdbcTemplete.query(query, new customeRow());
		return list;
	}

	private class customeRow implements RowMapper<LoginBean>{

		@Override
		public LoginBean mapRow(ResultSet rs, int rowMax) throws SQLException {
			LoginBean loginBean = new LoginBean();
			loginBean.setId(rs.getString("id"));
			loginBean.setPassword(rs.getString("password"));
			return loginBean;
		}
		
	}

}

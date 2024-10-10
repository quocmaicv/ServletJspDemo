package com.maitq2.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.maitq2.web.model.User;

public class UserDao {
	public User getUser(int userId) {
		User user = new User();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root1234");
			Statement statement = connection.createStatement();
			ResultSet rSet = statement.executeQuery("select * from users where id = "+userId);
			
			if (rSet.next()) {
				user.setId(rSet.getInt("id"));
				user.setName(rSet.getString("name"));
				user.setEmail(rSet.getString("email"));
				user.setCountry(rSet.getString("country"));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return user;
	}
		
}

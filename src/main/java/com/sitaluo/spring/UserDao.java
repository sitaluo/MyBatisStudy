package main.java.com.sitaluo.spring;

import main.java.com.sitaluo.domain.User;

public interface UserDao {

	public User findUserById(int id) throws Exception;
	
}

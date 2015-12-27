package test.java.com.sitaluo.spring;

import main.java.com.sitaluo.domain.User;
import main.java.com.sitaluo.spring.UserDao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	
	private static ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindUserById() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user.getUserName());
	}

}

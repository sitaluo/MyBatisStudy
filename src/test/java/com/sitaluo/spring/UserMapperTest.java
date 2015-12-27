package test.java.com.sitaluo.spring;

import main.java.com.sitaluo.domain.User;
import main.java.com.sitaluo.mapper.UserMapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

	private static ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper usermapper =  (UserMapper) applicationContext.getBean("userMapper");
		User user = usermapper.findUserById(1);
		System.out.println(user.getUserName());
	}

}

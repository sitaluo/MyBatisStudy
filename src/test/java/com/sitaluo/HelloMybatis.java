package test.java.com.sitaluo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import main.java.com.sitaluo.domain.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class HelloMybatis {

	@Test
	public  void findByUserId() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserById",1);
		
		System.out.println(user);
		sqlSession.close();
	}

	@Test
	public  void insertUser() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setUserName("testuser_insert");
		user.setBirthday(new Date());
		user.setAddress("qweqwe");
		user.setAge(18);
		//sqlSession.insert("test.insertUser", user);
		
		/*user.setId(3);
		sqlSession.delete("test.deleteUserById", user);*/
		
		user.setId(1);
		user.setUserName("testuser_update");
		sqlSession.update("updateUser",user);
		
		System.out.println(user);
		sqlSession.commit();
		sqlSession.close();
	}
	
}

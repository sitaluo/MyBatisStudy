package test.java.com.sitaluo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import main.java.com.sitaluo.domain.User;
import main.java.com.sitaluo.domain.UserCustom;
import main.java.com.sitaluo.mapper.UserMapper;
import main.java.com.sitaluo.vo.UserQueryVo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void init() throws IOException{
		if(sqlSessionFactory == null){
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
		    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}
	}
	
	@Test
	public void findUserById() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(1);
		System.out.println(user.getUserName());
	}
	
	@Test
	public void findUserList() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setUserName("test");
		userQueryVo.setUserCustom(userCustom);
		
		List<UserCustom> userCustomList = userMapper.findUserList(userQueryVo);
		
		System.out.println(userCustomList.size());
	}
	
	@Test
	public void findUserCount() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setUserName("test");
		userQueryVo.setUserCustom(userCustom);
		
		int userCount = userMapper.findUserCount(userQueryVo);
		
		System.out.println(userCount);
	}
	
	@Test
	public void insertUser() throws Exception{
		User user = new User();
		user.setUserName("tsetname001");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.insertUser(user);
		sqlSession.commit();
	}
	
	@Test
	public void updadateUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(1);
		user.setAge(1123);
		userMapper.updateUser(user);
		sqlSession.commit();
	}
	
	@Test
	public void deleteUserById() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.deleteUserById(5);
		userMapper.deleteUserById(555);
		sqlSession.commit();
	}
	
}

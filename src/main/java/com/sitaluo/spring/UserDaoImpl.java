package main.java.com.sitaluo.spring;

import main.java.com.sitaluo.domain.User;
import main.java.com.sitaluo.mapper.UserMapper;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession =this.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(1);
		System.out.println(user.getUserName());
		return user;
	}

}

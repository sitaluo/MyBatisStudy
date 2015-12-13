package test.java.com.sitaluo.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import main.java.com.sitaluo.domain.OrdersCustom;
import main.java.com.sitaluo.domain.UserCustom;
import main.java.com.sitaluo.mapper.OrdersMapperCustom;
import main.java.com.sitaluo.mapper.UserMapper;
import main.java.com.sitaluo.vo.UserQueryVo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class OrdersMapperCusomTest {

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
	public void testfindOrdersUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		
		List<OrdersCustom> userCustomList = ordersMapperCustom.findOrdersUser();
		
		System.out.println(userCustomList.size());
	}
	
	@Test
	public void testfindOrdersUserByResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		List<OrdersCustom> userCustomList = ordersMapperCustom.findOrdersUserByResultMap();
		System.out.println(userCustomList.size());
	}
	
	@Test
	public void findOrdersAndOrdersDetailResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		List<OrdersCustom> userCustomList = ordersMapperCustom.findOrdersAndOrdersDetailResultMap();
		
		System.out.println(userCustomList.size());
	}
	
	

}

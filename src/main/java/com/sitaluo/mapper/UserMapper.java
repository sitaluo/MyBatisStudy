package main.java.com.sitaluo.mapper;

import java.util.List;

import main.java.com.sitaluo.domain.User;
import main.java.com.sitaluo.domain.UserCustom;
import main.java.com.sitaluo.vo.UserQueryVo;

public interface UserMapper {

	public User findUserById(int id) throws Exception;
	
	/**
	 * 用户综合信息查询
	 * @param userQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	/**
	 * 用户综合信息查询 (总数)
	 * @param userQueryVo
	 * @return
	 * @throws Exception
	 */
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	public void insertUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void deleteUserById(int id) throws Exception;
	
}

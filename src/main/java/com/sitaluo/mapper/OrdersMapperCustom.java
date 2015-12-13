package main.java.com.sitaluo.mapper;

import java.util.List;

import main.java.com.sitaluo.domain.OrdersCustom;

public interface OrdersMapperCustom {

	// 查询关联用户信息的订单
	public List<OrdersCustom> findOrdersUser() throws Exception;

	// 查询关联用户信息的订单
	public List<OrdersCustom> findOrdersUserByResultMap() throws Exception;

	// 查询关联用户信息的订单
	public List<OrdersCustom> findOrdersAndOrdersDetailResultMap()
			throws Exception;
}

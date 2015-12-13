package main.java.com.sitaluo.domain;

/**
 * 订单的扩展类
 * @author kevinwu
 *通过此类映射订单和用户查询的结果，一般继承包含属性较多的po类
 */
public class OrdersCustom extends Orders{

	//添加用户属性
	private String userName;
	private int age;
	private String address;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

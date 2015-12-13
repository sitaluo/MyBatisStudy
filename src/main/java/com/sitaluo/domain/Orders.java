package main.java.com.sitaluo.domain;

import java.util.Date;
import java.util.List;

public class Orders {

	private int id;
	//订单号
	private String number;
	private Date createTime;
	//描述
	private String note;
	private int userId;
	
	private User user;
	private List<OrdersDetail> ordersDetails;
	
	public List<OrdersDetail> getOrdersDetails() {
		return ordersDetails;
	}
	public void setOrdersDetails(List<OrdersDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}

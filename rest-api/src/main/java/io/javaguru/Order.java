package io.javaguru;

public class Order {
	public Integer id;
	public String orderNumber;
	public String description;
	
	public Order() {
		
	}	
	
	public Order(Integer id, String orderNumber, String description) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	 
	

	@Column(name = "giftname")
	private String giftname;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "quantity")
	private String quantity;
	
	@Column(name = "price")
	private String price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGiftname() {
		return giftname;
	}

	public void setGiftname(String giftname) {
		this.giftname = giftname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String giftname, String type, String quantity, String price) {
		super();
		this.id = id;
		this.giftname = giftname;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}
	
	
}

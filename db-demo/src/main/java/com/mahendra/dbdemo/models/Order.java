package com.mahendra.dbdemo.models;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
	@Column(name="ORD_NUM")
	@Id
	private Integer orderId;
	
	@Column(name="ORD_AMOUNT")
	private Double amount;
	
	@Column(name="ADVANCE_AMOUNT")
	private Double advanceAmount;
	
	@Column(name="ORD_DATE")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="CUST_CODE",length=6)
	private String customerCode;
	
	@Column(name="AGENT_CODE",length=6)
	private String agentCode;
	
	@Column(name="ORD_DESCRIPTION",length=60)
	private String description;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(Double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

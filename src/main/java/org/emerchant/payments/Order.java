package org.emerchant.payments;

import java.util.Currency;

public class Order {
	   private String orderID;
	   private String customerName;
	   private String merchantName;
	   private String description;
	   private String email;
	   private Currency currency;
	   private Address billingAddres;
	   private Address shippingAddres;
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Address getBillingAddres() {
		return billingAddres;
	}
	public void setBillingAddres(Address billingAddres) {
		this.billingAddres = billingAddres;
	}
	public Address getShippingAddres() {
		return shippingAddres;
	}
	public void setShippingAddres(Address shippingAddres) {
		this.shippingAddres = shippingAddres;
	}


}

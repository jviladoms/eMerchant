package org.emerchant.payments.gateways;

import java.util.List;
import java.util.Locale;

import org.emerchant.payments.Address;
import org.emerchant.payments.CreditCards;
import org.emerchant.payments.Order;

import java.util.Currency;

public abstract class Gateway {
   
	private String gatewayName;
	private GatewayURLs gatewayUrls;
	private Currency Currency;
	private List<Locale> supportedCountries;
	private List<Currency> suportedCurrencies;
	private List<CreditCards> supportedCreditCards;
	private boolean isTest;
	private Address MerchantAddress;
	
	public abstract GatewayResponse authorize(double amount, Order order, Currency currency, boolean istest);
	public abstract GatewayResponse authorize(double amount, Order order, boolean istest);
	public abstract GatewayResponse authorize(double amount, Order order);
	
	public abstract GatewayResponse capture(double amount, String Transaction, boolean istest);
	public abstract GatewayResponse capture(double amount, String Transaction);
	public abstract GatewayResponse capture(String Transaction);
	
	public abstract GatewayResponse refund(double amount, String Transaction, boolean istest);
	public abstract GatewayResponse refund(double amount, String Transaction);
	public abstract GatewayResponse refund(String Transaction);
	
	public String getGatewayName() {
		return gatewayName;
	}
	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}
	public Currency getCurrency() {
		return Currency;
	}
	public void setCurrency(Currency currency) {
		Currency = currency;
	}
	public List<Locale> getSupportedCountries() {
		return supportedCountries;
	}
	public void setSupportedCountries(List<Locale> supportedCountries) {
		this.supportedCountries = supportedCountries;
	}
	public List<Currency> getSuportedCurrencies() {
		return suportedCurrencies;
	}
	public void setSuportedCurrencies(List<Currency> suportedCurrencies) {
		this.suportedCurrencies = suportedCurrencies;
	}
	public List<CreditCards> getSupportedCreditCards() {
		return supportedCreditCards;
	}
	public void setSupportedCreditCards(List<CreditCards> supportedCreditCards) {
		this.supportedCreditCards = supportedCreditCards;
	}
	public boolean isTest() {
		return isTest;
	}
	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}
	public Address getMerchantAddress() {
		return MerchantAddress;
	}
	public void setMerchantAddress(Address merchantAddress) {
		MerchantAddress = merchantAddress;
	}
	public GatewayURLs getGatewayUrls() {
		return gatewayUrls;
	}
	public void setGatewayUrls(GatewayURLs gatewayUrls) {
		this.gatewayUrls = gatewayUrls;
	}
	
}

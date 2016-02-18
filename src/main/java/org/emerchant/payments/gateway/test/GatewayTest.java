package org.emerchant.payments.gateway.test;

import org.emerchant.payments.Order;
import org.emerchant.payments.gateways.Gateway;
import org.emerchant.payments.gateways.GatewayResponse;

public class GatewayTest extends Gateway{

	@Override
	public GatewayResponse authorize(double amount, Order order, java.util.Currency currency, boolean istest) {
		
		
		GatewayResponse response = new GatewayResponse();
		response.setStatusCode("200");
		response.setStatusDescription("OK");
		return response;
	}

	@Override
	public GatewayResponse authorize(double amount, Order order, boolean istest) {
		return this.authorize(amount,order,null,false);
	}

	@Override
	public GatewayResponse authorize(double amount, Order order) {
		return this.authorize(amount,order,false);
	}

	@Override
	public GatewayResponse capture(double amount, String Transaction, boolean istest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GatewayResponse capture(double amount, String Transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GatewayResponse capture(String Transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GatewayResponse refund(double amount, String Transaction, boolean istest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GatewayResponse refund(double amount, String Transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GatewayResponse refund(String Transaction) {
		// TODO Auto-generated method stub
		return null;
	}

}

package org.emerchant.payments;

import java.util.Currency;
import java.util.Locale;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.emerchant.payments.gateway.test.GatewayTest;
import org.emerchant.payments.gateways.Gateway;
import org.emerchant.payments.gateways.GatewayResponse;

@Path("gateways")
public class test {

	private Order order = new Order();
	private Currency currency = Currency.getInstance(Locale.GERMANY);
	private double amount = 34.89; 
	
    @Path("{gatewayname}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response createGateway(@PathParam("gatewayname") String gateway) {
    	
    	Gateway newGateway = new GatewayTest();
    	
    	Address address = new Address();
    	
    	address.setCity("Sant Vicenç de Castellet");
    	address.setHouseNumber(2);
    	
    	
    	order.setBillingAddres(address);
    	order.setCurrency(currency);
    	order.setCustomerName("Jordi Viladoms");
    	order.setDescription("Que bonito");
    	
    	GatewayResponse response = newGateway.authorize(amount, order);
    	
    	String resposta = "OLEEEEE";
		return Response.status(200).entity(order).build();
    }
}
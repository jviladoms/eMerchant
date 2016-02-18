package org.emerchant.payments.gateway.test;

import java.net.URL;

import org.emerchant.payments.gateways.GatewayResponse;

public class GatewayTestResponse extends GatewayResponse{
	private URL redirectURL;

	public URL getRedirectURL() {
		return redirectURL;
	}

	public void setRedirectURL(URL redirectURL) {
		this.redirectURL = redirectURL;
	}
}

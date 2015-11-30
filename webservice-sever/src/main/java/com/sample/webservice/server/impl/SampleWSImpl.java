package com.sample.webservice.server.impl;

import javax.jws.WebService;

import com.sample.webservice.server.ISampleWS;

@WebService(serviceName = "SampleWSImpl", portName = "SampleWSPort", endpointInterface = "com.sample.webservice.server.ISampleWS", targetNamespace = "http://server.webservice.sample.com")
public class SampleWSImpl implements ISampleWS{
	@Override
	public String hello(String name) {
		return "Hello! Mr/Ms " + name + " From SampleWS";
	}
}

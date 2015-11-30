package com.sample.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "ISampleWS", targetNamespace = "http://server.webservice.sample.com")
public interface ISampleWS {


	@WebMethod
	public String hello(@WebParam(name = "name") String name);


}

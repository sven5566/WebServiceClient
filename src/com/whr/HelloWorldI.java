package com.whr;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorldI {
	@WebMethod
	String sayHi(String name);
}

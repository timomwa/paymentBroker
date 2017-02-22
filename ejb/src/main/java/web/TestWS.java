package web;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="testWS")
public class TestWS {

	@WebMethod
	public String sayHello(){
		return "Hello";
	}
}

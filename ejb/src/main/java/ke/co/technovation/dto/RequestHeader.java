package ke.co.technovation.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="requestHeader", namespace="http://service.technovation.co.ke")
public class RequestHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4419347975171123177L;
	
	private String username;
	private  String password;
	private String systemID;
	private String systemToken;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSystemID() {
		return systemID;
	}
	public void setSystemID(String systemID) {
		this.systemID = systemID;
	}
	public String getSystemToken() {
		return systemToken;
	}
	public void setSystemToken(String systemToken) {
		this.systemToken = systemToken;
	}
	
	

}
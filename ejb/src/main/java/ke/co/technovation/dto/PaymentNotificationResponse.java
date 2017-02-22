package ke.co.technovation.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="paymentNotificationResponse", namespace="http://service.technovation.co.ke")
public class PaymentNotificationResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5474983200726913213L;
	private String statusCode;
	private String statusMessage;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	

}

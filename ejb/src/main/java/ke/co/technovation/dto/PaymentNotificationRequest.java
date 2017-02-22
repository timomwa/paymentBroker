package ke.co.technovation.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="paymentNotificationRequest", namespace="http://service.technovation.co.ke")
public class PaymentNotificationRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5124786601127666890L;
	private RequestHeader requestHeader;
	private PaymentNotification paymentNotification;
	
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
	public PaymentNotification getPaymentNotification() {
		return paymentNotification;
	}
	public void setPaymentNotification(PaymentNotification paymentNotification) {
		this.paymentNotification = paymentNotification;
	}
	
	

}

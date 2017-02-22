package ug.or.nda.dto;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ug.or.nda.dto.PaymentNotificationResponse;
import ug.or.nda.dto.PaymentNotificationRequest;

@WebService(name="paymentService" , targetNamespace="http://services.nda.or.ug")
public class PaymentService {
	
	@WebMethod
	public PaymentNotificationResponse paymentNotification(PaymentNotificationRequest paymentNotificationReq){
		return null;
	}

}

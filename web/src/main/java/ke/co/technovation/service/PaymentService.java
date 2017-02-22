package ke.co.technovation.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ke.co.technovation.dto.PaymentNotificationRequest;
import ke.co.technovation.dto.PaymentNotificationResponse;

@WebService(name="paymentService" , targetNamespace="http://services.technovation.co.ke")
public class PaymentService {
	
	@WebMethod
	public PaymentNotificationResponse paymentNotification(PaymentNotificationRequest paymentNotificationReq){
		return null;
	}

}

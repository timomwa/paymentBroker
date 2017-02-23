package ug.or.nda.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import ug.or.nda.dto.PaymentNotificationResponse;
import ug.or.nda.ejb.PaymentNotificationEJBI;
import ug.or.nda.dto.PaymentNotificationRequest;

@WebService(name="paymentService" , targetNamespace="http://services.nda.or.ug")
@Stateless
public class PaymentService {
	
	@EJB
	private PaymentNotificationEJBI paymentNotification;
	
	private Logger logger = Logger.getLogger(getClass());
	
	@WebMethod
	public PaymentNotificationResponse paymentNotification(PaymentNotificationRequest paymentNotificationReq){
		
		logger.info(paymentNotificationReq);
		
		PaymentNotificationResponse resp = null;
		
		try{
		
			resp =  paymentNotification.paymentNotification(paymentNotificationReq);
		
		}catch(Exception e){
		
			logger.error(e.getMessage(), e);
		
		}
		
		return resp;
	}

}

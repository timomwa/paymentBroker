package ug.or.nda.ejb;

import javax.ejb.Schedule;
import javax.ejb.Singleton;

import org.apache.log4j.Logger;

@Singleton
public class PaymentForwardEJBSingleton {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Schedule(minute="*/1", hour="*")
	public void syncPayments(){
		logger.info(" ********* running ******** ");
	}

}

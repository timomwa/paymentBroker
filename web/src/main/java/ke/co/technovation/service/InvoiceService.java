package ke.co.technovation.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ke.co.technovation.dto.InvoiceValidationRequest;

@WebService(name="invoiceservice" , targetNamespace="http://services.technovation.co.ke")
public class InvoiceService {
	
	@WebMethod
	public InvoiceService validateInvoice(InvoiceValidationRequest invoiceValidationReq){
		return null;
	}
	
}

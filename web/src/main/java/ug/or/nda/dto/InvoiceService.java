package ug.or.nda.dto;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ke.co.technovation.dto.InvoiceValidationRequest;
import ke.co.technovation.dto.InvoiceValidationResponse;

@WebService(name="invoiceservice" , targetNamespace="http://services.nda.or.ug")
public class InvoiceService {
	
	@WebMethod
	public InvoiceValidationResponse  validateInvoice(InvoiceValidationRequest invoiceValidationReq){
		return null;
	}
	
}

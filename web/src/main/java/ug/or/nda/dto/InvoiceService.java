package ug.or.nda.dto;

import javax.jws.WebMethod;
import javax.jws.WebService;


import ug.or.nda.dto.InvoiceValidationResponse;
import ug.or.nda.dto.InvoiceValidationRequest;

@WebService(name="invoiceservice" , targetNamespace="http://services.nda.or.ug")
public class InvoiceService {
	
	@WebMethod
	public InvoiceValidationResponse  validateInvoice(InvoiceValidationRequest invoiceValidationReq){
		return null;
	}
	
}

package ug.or.nda.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import ug.or.nda.dto.InvoiceValidationResponseDTO;
import ug.or.nda.ejb.InvoiceServiceEJBI;
import ug.or.nda.dto.InvoiceValidationRequestDTO;

@WebService(name="invoiceservice" , targetNamespace="http://services.nda.or.ug")
@Stateless
public class InvoiceService {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@EJB
	private InvoiceServiceEJBI invoiceService;
	
	@WebMethod
	public InvoiceValidationResponseDTO  validateInvoice(InvoiceValidationRequestDTO invoiceValidationReq){
		
		logger.info(invoiceValidationReq);
		
		InvoiceValidationResponseDTO response = null;
		
		try{
		
			response = invoiceService.validateInvoice(invoiceValidationReq);
	
		}catch(Exception e){
		
			logger.error(e.getMessage(), e);
		
		}
		
		return response;
	}
	
}

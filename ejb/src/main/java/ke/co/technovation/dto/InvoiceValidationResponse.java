package ke.co.technovation.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="invoiceValidationResponse", namespace="http://service.technovation.co.ke")
public class InvoiceValidationResponse implements Serializable {

	private static final long serialVersionUID = -8582351670605528433L;
	
	private Invoice invoice;
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
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	

}

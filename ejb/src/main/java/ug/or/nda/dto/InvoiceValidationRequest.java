package ug.or.nda.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="invoiceValidationRequest", namespace="http://service.nda.or.ug")
public class InvoiceValidationRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3635480331572742573L;
	private RequestHeader requestHeader;
	private String invoiceNo;
	
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	
	
}

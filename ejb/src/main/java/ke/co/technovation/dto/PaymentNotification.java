package ke.co.technovation.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="paymentNotification", namespace="http://service.technovation.co.ke")
public class PaymentNotification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6206981618048001460L;
	private String invoiceNo;
	private Double amount;
	private String currencyCode;
	private String transactionRef;
	private Date transactionDate;
	private String paymentMode;
	
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getTransactionRef() {
		return transactionRef;
	}
	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	

}

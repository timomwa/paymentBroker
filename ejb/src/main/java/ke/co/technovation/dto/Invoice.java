package ke.co.technovation.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="invoice", namespace="http://service.technovation.co.ke")
public class Invoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6044267411024241400L;
	private String invoiceNo;
	private String description;
	private BigDecimal amount;
	private String currencyCode;
	private String customerName;
	private Date dueDate;
	private String reference1;
	
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getReference1() {
		return reference1;
	}
	public void setReference1(String reference1) {
		this.reference1 = reference1;
	}
	
	

}

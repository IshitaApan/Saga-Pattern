package saga.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRequest {
	private String userName;
	@Id
	private Long customerId;
	private String transactionType;
	private Double amount;
	private String status;
	
	public UserRequest(String userName, Long customerId, String transactionType, Double amount, String status) {
		super();
		this.userName = userName;
		this.customerId = customerId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

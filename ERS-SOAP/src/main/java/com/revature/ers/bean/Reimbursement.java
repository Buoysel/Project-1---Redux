package com.revature.ers.bean;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="REIMBURSEMENT")
@SequenceGenerator(name="REIMID_SEQ", initialValue=1, allocationSize=100)
public class Reimbursement implements Serializable {

	private static final long serialVersionUID = 5383771635931158226L;

	@Id
	@Column(name="REIMBURSEMENT_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REIMID_SEQ")
	private Integer reimbursementID;
	
	@Column(name="DESCRIPTION")
	private String description = "N/A";
	
	@Column(name="AMOUNT")
	private Double amount;
	
	@Column(name="RECEIPT")
	private Blob receipt = null;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="AUTHOR_ID", referencedColumnName="USER_ID")
	private ERSUser author;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="STATUS_ID", referencedColumnName="STATUS_ID")
	private StatusType status;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="RESOLVER_ID", referencedColumnName="USER_ID")
	private ERSUser resolver = null;
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(String description, Double ammount, Blob receipt,
			ERSUser author, StatusType status, ERSUser resolver) {
		super();
		this.description = description;
		this.amount = ammount;
		this.receipt = receipt;
		this.author = author;
		this.status = status;
		this.resolver = resolver;
	}

	public Integer getReimbursementID() {
		return reimbursementID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmmunt(Double amount) {
		this.amount = amount;
	}
	public Blob getReceipt() {
		return receipt;
	}
	public void setReceipt(Blob receipt) {
		this.receipt = receipt;
	}
	public ERSUser getAuthor() {
		return author;
	}
	public void setAuthor(ERSUser author) {
		this.author = author;
	}
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	public ERSUser getResolver() {
		return resolver;
	}
	public void setResolver(ERSUser resolver) {
		this.resolver = resolver;
	}
	@Override
	public String toString() {
		return "Reimbursement [reimbursementID=" + reimbursementID + ", description=" + description + ", amount="
				+ amount + ", receipt=" + receipt + ", author=" + author + ", status=" + status + ", resolver="
				+ resolver + "]";
	}
	
	

}

package com.revature.ers.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="STATUS_TYPE")
public class StatusType implements Serializable {

	private static final long serialVersionUID = 5458001034778948778L;
	
	@Id
	@Column(name="STATUS_ID")
	private Integer StatusID;
	
	@Column(name="STATUS_NAME")
	private String StatusName;
	public StatusType() {
		super();
	}
	public StatusType(String statusName) {
		super();
		StatusName = statusName;
	}
	public Integer getStatusID() {
		return StatusID;
	}
	
	public String getStatusName() {
		return StatusName;
	}
	public void setStatusName(String statusName) {
		StatusName = statusName;
	}
	@Override
	public String toString() {
		return "StatusType [StatusID=" + StatusID + ", StatusName=" + StatusName + "]";
	}
	
	

}

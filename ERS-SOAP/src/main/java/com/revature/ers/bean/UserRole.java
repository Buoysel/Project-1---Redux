package com.revature.ers.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="USER_ROLE")
public class UserRole implements Serializable {
	
	private static final long serialVersionUID = 8335352003628257137L;
	
	@Id
	@Column(name="ROLE_ID")
	private Integer roleID;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	public UserRole() {
		super();
	}
	
	public UserRole(Integer roleID) {
		this.roleID = roleID;
	}
	
	public Integer getRoleID() {
		return roleID;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return "UserRole [roleID=" + roleID + ", roleName=" + roleName + "]";
	}
}

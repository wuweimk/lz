package com.lz.entity;

public class Role {
	
	private String roleId;
	private String name;
	private String state;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Role(){};
	
	public Role(String roleId, String name, String state) {
		super();
		this.roleId = roleId;
		this.name = name;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name + ", state=" + state + "]";
	}
	
	
	
}

package com.lz.entity;

/**
 * Description 用户角色关联表
 * @author Administrator
 *
 */
public class BaUserRole {

	private long uid;
	private long rid;
	
	public BaUserRole(){};
	
	public BaUserRole(long uid, long rid) {
		super();
		this.uid = uid;
		this.rid = rid;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	
}

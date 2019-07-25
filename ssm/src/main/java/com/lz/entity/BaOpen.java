package com.lz.entity;

/**
 * Description ba_open 表
 * @author Administrator
 *
 */
public class BaOpen {

	private long uid;
	private String openid;//特殊标识
	
	public BaOpen(){};
	public BaOpen(long uid, String openid) {
		super();
		this.uid = uid;
		this.openid = openid;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	
}

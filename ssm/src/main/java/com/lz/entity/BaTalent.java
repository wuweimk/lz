package com.lz.entity;

/**
 * Description 用户天赋表
 * @author Administrator
 *
 */
public class BaTalent {

	private long uid;
	private int talent;
	private int goodIs;
	
	public BaTalent(){};
	
	public BaTalent(long uid, int talent, int goodIs) {
		super();
		this.uid = uid;
		this.talent = talent;
		this.goodIs = goodIs;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public int getTalent() {
		return talent;
	}
	public void setTalent(int talent) {
		this.talent = talent;
	}
	public int getGoodIs() {
		return goodIs;
	}
	public void setGoodIs(int goodIs) {
		this.goodIs = goodIs;
	}
	
	
	
}

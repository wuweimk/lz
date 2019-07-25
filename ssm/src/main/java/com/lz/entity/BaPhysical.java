package com.lz.entity;

/**
 * Description 用户体力表
 * @author Administrator
 *
 */
public class BaPhysical {

	private Long uid;//用户id
	private int physical;//用户体力-初始体力20,一局消耗5点体力值,
	private int bigTime;//体力恢复时间戳-10分钟恢复1体力
	
	public BaPhysical(){};
	
	
	public BaPhysical(Long uid, int physical, int bigTime) {
		super();
		this.uid = uid;
		this.physical = physical;
		this.bigTime = bigTime;
	}
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public int getPhysical() {
		return physical;
	}
	public void setPhysical(int physical) {
		this.physical = physical;
	}
	public int getBigTime() {
		return bigTime;
	}
	public void setBigTime(int bigTime) {
		this.bigTime = bigTime;
	}
	
}

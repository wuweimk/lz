package com.lz.entity;

/**
 * @description 用户表
 * @author Administrator
 *
 */
public class BaUser {

	private long uid;//用户id
	private String nick;//用户昵称
	private String head;//用户头像
	private int sex;//用户性别（1-男，2-女）
	private int gold;//用户金币
	private int material;
	
	public BaUser(){};
	
	public BaUser(long uid, String nick, String head, int sex, int gold, int material, int diamond, int customs,
			long logTime, long regTime, long inviterUid) {
		super();
		this.uid = uid;
		this.nick = nick;
		this.head = head;
		this.sex = sex;
		this.gold = gold;
		this.material = material;
		this.diamond = diamond;
		this.customs = customs;
		this.logTime = logTime;
		this.regTime = regTime;
		this.inviterUid = inviterUid;
	}
	public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
	private int diamond;//用户金币
	private int customs;//关卡
	private long logTime;//登陆时间-时间戳
	private long regTime;//注册时间-时间戳
	private long inviterUid;//该用户的邀请人id,如果无则没有
	
	
	public BaUser(long uid, String nick, String head, int sex, int gold, int diamond, int customs,
			long logTime, long regTime, long inviterUid) {
		super();
		this.uid = uid;
		this.nick = nick;
		this.head = head;
		this.sex = sex;
		this.gold = gold;
		this.diamond = diamond;
		this.customs = customs;
		this.logTime = logTime;
		this.regTime = regTime;
		this.inviterUid = inviterUid;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public int getDiamond() {
		return diamond;
	}
	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}
	public int getCustoms() {
		return customs;
	}
	public void setCustoms(int customs) {
		this.customs = customs;
	}
	public long getLogTime() {
		return logTime;
	}
	public void setLogTime(long logTime) {
		this.logTime = logTime;
	}
	public long getRegTime() {
		return regTime;
	}
	public void setRegTime(long regTime) {
		this.regTime = regTime;
	}
	public long getInviterUid() {
		return inviterUid;
	}
	public void setInviterUid(long inviterUid) {
		this.inviterUid = inviterUid;
	}
	
	
	
	
}

package com.lz.service;

import java.util.List;

import com.lz.entity.BaUser;

public interface BaUserService {
	
	//查询用户表所有
	public List<BaUser> findAll();
	//通过id 查询用户
	public BaUser findUserById(long uid);
	//修改用户
	public BaUser setUserGold(BaUser baUser);
}

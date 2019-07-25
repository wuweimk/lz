package com.lz.dao;

import java.util.List;

import com.lz.entity.BaUser;

public interface BaUserDao {
	
	//查询用户表所有内容
	public List<BaUser> findAll();
	//通过用户id查询相应的用户
	public BaUser findBaUserById(long l);
	//更新用户表中的数据
	public void updateUserGold(BaUser newBaUser);
	
}

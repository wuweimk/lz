package com.lz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lz.dao.BaUserDao;
import com.lz.entity.BaUser;
import com.lz.service.BaUserService;

@Service
public class BaUserServiceImpl implements BaUserService {

	@Autowired
	private BaUserDao baUserDao;
	
	@Override
	public List<BaUser> findAll() {
		return baUserDao.findAll();
	}

	@Override
	public BaUser findUserById(long uid) {
		return baUserDao.findBaUserById(uid);
	}

	//上传金币
	@Override
	@Transactional
	public BaUser setUserGold(BaUser baUser) {
		//baUserDao.findBaUserById(baUser.getUid());//根据uid从数据库里面查询出用户
		BaUser newBaUser = new BaUser();
		//更新用户表中的金币数据
		newBaUser.setUid(baUser.getUid());
		newBaUser.setGold(baUserDao.findBaUserById(baUser.getUid()).getGold()+baUser.getGold());
		baUserDao.updateUserGold(newBaUser );
		return baUserDao.findBaUserById(baUser.getUid());//返回一个对象
	}

}

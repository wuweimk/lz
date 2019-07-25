package com.lz.web.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lz.entity.BaUser;
import com.lz.entity.Result;
import com.lz.service.BaUserService;

@RestController
@RequestMapping("/find")
public class BaUserController {

	@Autowired
	private BaUserService baUserService;
	
	/*@RequestMapping("/findAll")
	public List<BaUser> findAll(){
		return baUserService.findAll();
	}*/
	
	//查询所有的数据
	@RequestMapping("/findAll")
	public Result findAll(){
		try {
			baUserService.findAll();
			Result result = new Result();
			result.setCode("1");
			result.setData(baUserService.findAll());
			result.setMsg("获取数据成功");
			return result;
		} catch (Exception e) {
			Result result = new Result();
			result.setCode("0");
			result.setMsg(e.getMessage()+"获取失败");
			return result;
		}		
	}
	
	@RequestMapping("/findUserById")
	public Result findUserById(long uid){
		try {
			baUserService.findAll();
			Result result = new Result();
			result.setCode("1");
			result.setData(baUserService.findUserById(uid));
			result.setMsg("获取数据成功");
			return result;
		} catch (Exception e) {
			Result result = new Result();
			result.setCode("0");
			result.setMsg(e.getMessage()+"获取失败");
			return result;
		}		
		
	}
	
	//设置用户金币
	@RequestMapping("/setUserGold")
	public Result setUserGold(){
		
		BaUser baUser = new BaUser();
		baUser.setUid(6);
		baUser.setGold(10);
		try {
			baUserService.findAll();
			Result result = new Result();
			result.setCode("1");
			result.setData(baUserService.setUserGold(baUser));
			result.setMsg("获取数据成功");
			return result;
		} catch (Exception e) {
			Result result = new Result();
			result.setCode("0");
			result.setMsg(e.getMessage()+"获取失败");
			return result;
		}		
		
	}
	
	//获取用户排名情况
	
	
	
	
	
}

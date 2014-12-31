package com.jiazc.store.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiazc.store.login.dao.LoginDao;
import com.jiazc.store.login.model.UserModel;

/**
 * @author jason.jia
 *2014年12月30日
 * 上午11:48:43
 */
@Service
public class LoginBiz {
	@Resource
	private LoginDao loginDao;

/**
 * 登录验证
 * @param model
 * @return
 */
	public String checkLogin(UserModel model) {
		String username = model.getUsername();
		String pwd = model.getPassword();
		UserModel result = loginDao.getUser(username);
		if(result == null){
			return "用户不存在！";
		}else if(!pwd.equals(loginDao.checkPwd(username))){
			return "密码错误！";		
		}
		return null;
	}
}

package com.jiazc.store.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiazc.store.login.dao.LoginDao;
import com.jiazc.store.login.model.UserModel;

/**
 * @author jason.jia
 *2014��12��30��
 * ����11:48:43
 */
@Service
public class LoginBiz {
	@Resource
	private LoginDao loginDao;

/**
 * ��¼��֤
 * @param model
 * @return
 */
	public String checkLogin(UserModel model) {
		String username = model.getUsername();
		String pwd = model.getPassword();
		UserModel result = loginDao.getUser(username);
		if(result == null){
			return "�û������ڣ�";
		}else if(!pwd.equals(loginDao.checkPwd(username))){
			return "�������";		
		}
		return null;
	}
}

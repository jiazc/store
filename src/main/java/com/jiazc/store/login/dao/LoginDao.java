package com.jiazc.store.login.dao;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.jiazc.store.login.model.UserModel;

/**
 * @author jason.jia
 *2014��12��30��
 * ����12:04:02
 */
@Repository
public class LoginDao {
	@Resource
	private SqlMapClient sqlMapClient;
	/**
	 * �����û�
	 * @param username
	 * @return
	 */
	public UserModel getUser(String username) {
		try{
			UserModel user = (UserModel)this.sqlMapClient.queryForObject("getUser",username);
			return user;
		}catch(SQLException e){
			throw new RuntimeException("���ݿ������ѯ����ʧ�ܣ�", e);
		}
	}

	/**
	 * �������
	 * @param username
	 * @return
	 */
	public String checkPwd(String username) {
		try{
			String pwd = (String)this.sqlMapClient.queryForObject("getPwd", username);
			return pwd;
		}catch(SQLException e){
			throw new RuntimeException("���ݿ������ѯ����ʧ�ܣ�", e);
		}
	}

}

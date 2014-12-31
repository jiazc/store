package com.jiazc.store.login.dao;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.jiazc.store.login.model.UserModel;

/**
 * @author jason.jia
 *2014年12月30日
 * 下午12:04:02
 */
@Repository
public class LoginDao {
	@Resource
	private SqlMapClient sqlMapClient;
	/**
	 * 查找用户
	 * @param username
	 * @return
	 */
	public UserModel getUser(String username) {
		try{
			UserModel user = (UserModel)this.sqlMapClient.queryForObject("getUser",username);
			return user;
		}catch(SQLException e){
			throw new RuntimeException("数据库操作查询数据失败！", e);
		}
	}

	/**
	 * 检查密码
	 * @param username
	 * @return
	 */
	public String checkPwd(String username) {
		try{
			String pwd = (String)this.sqlMapClient.queryForObject("getPwd", username);
			return pwd;
		}catch(SQLException e){
			throw new RuntimeException("数据库操作查询数据失败！", e);
		}
	}

}

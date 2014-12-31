
package com.jiazc.store.login.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiazc.store.login.model.UserModel;
import com.jiazc.store.login.service.LoginBiz;

/**
 * User:Jason.Jia
 * Date:2014/11/26
 * Time:15:09
 */
@Controller
public class LoginAction {
	@Resource
	private LoginBiz loginBiz;
    @RequestMapping("/login/login/login.do")
    public String login(ModelMap map,UserModel model){
    	String message = loginBiz.checkLogin(model);
    	if(message == null){
    		map.addAttribute("userModel",model);
    		return "main";
    	}
        map.addAttribute("message",message);
        return "../../login";
    }
}


package com.forum.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forum.model.dao.UserinfoMapper;
import com.forum.model.entity.Userinfo;
import com.forum.model.entity.UserinfoExample;
import com.forum.model.entity.UserinfoExample.Criteria;
import com.forum.model.service.LoginManagerService;

@RestController
public class LoginManageController {
	public static final String M_USER="CURRENTUSER";
	@Autowired
	private LoginManagerService service;
	@Autowired
	private UserinfoMapper usermapper;
	
	@RequestMapping("/logintime")
	public Userinfo modLoginTime(HttpSession session) {
		System.out.println(1);
		Userinfo user = (Userinfo) session.getAttribute(M_USER);
		System.out.println(2);
		Userinfo copy = (Userinfo) user.clone();
//		UserinfoExample example=new UserinfoExample();
		System.out.println(3);
//		Criteria uc = example.createCriteria();
//		System.out.println(4);
		Date date = new Date(); 
//		System.out.println(5);
//		uc.andUserregdateEqualTo(date);
//		System.out.println(6);
//		//这里用date
//		usermapper.updateByExampleSelective(user, example);
//		System.out.println(user);
//		System.out.println(date);
		System.out.println(7);
		service.modUserTime(user.getUserid(), date);
		System.out.println("logintime函数"+copy.getUserregdate());
		 return copy;
		 }	
	
	@PostMapping("/login")
	public Userinfo doLogin(Userinfo user,HttpSession session) {
		Userinfo result=service.checkLogin(user);
		if(null !=result) {
			//System.out.println("没有登录以前，session.M_USER是"+session.getAttribute(M_USER));
			session.setAttribute("CURRENTUSER",result);
			//System.out.println("登录以后，session.M_USER是"+session.getAttribute(M_USER));
			return result;
		}
		else {
			return null;
		}
	
	}
	
	/**
	 * @author ltc
	 * @param session
	 */
	@RequestMapping("/logout")
	public String doLogout(HttpSession session) {
			//System.out.println("没有注销以前，session.M_USER是"+session.getAttribute(M_USER));
			session.setAttribute("CURRENTUSER",null);
			//System.out.println("注销以后，session.M_USER是"+session.getAttribute(M_USER));
			return "You have successfully logged out.";
	}
	
}

package com.forum.model.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.model.dao.UserinfoMapper;
import com.forum.model.entity.Userinfo;
import com.forum.model.entity.UserinfoExample;
import com.forum.model.entity.UserinfoExample.Criteria;



@Service
public class LoginManagerService {
	@Autowired
	private UserinfoMapper usermapper;
	public static final String M_USER="CURRENTUSER";
	 public Userinfo checkLogin(Userinfo user) {
		UserinfoExample example=new UserinfoExample();
		 Criteria cc=example.createCriteria();
		 cc.andUsernameEqualTo(user.getUsername());
		 cc.andUserpasswordEqualTo(user.getUserpassword());
		List<Userinfo> list= usermapper.selectByExample(example);
		if(list.size()>0) {
			return list.get(0);
		}
		else {
			return null;
		}
	 }
	 
	 public boolean modUserTime(int userid, Date date) {
			Userinfo user = usermapper.selectByPrimaryKey(userid);
			user.setUserregdate(date);
			int i = usermapper.updateByPrimaryKey(user);
			return i>0;
	 }
}

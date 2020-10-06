package com.forum.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.forum.model.dao.UserinfoMapper;
import com.forum.model.entity.Userinfo;



@Service
public class RegisterManagerService {
	@Autowired
	private UserinfoMapper usermapper;
	public boolean addUser(Userinfo user) {
		int i=usermapper.insert(user);
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}
}

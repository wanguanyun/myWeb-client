package com.myweb.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.demo.dao.master.LoginDao;
import com.myweb.demo.domain.User;
import com.myweb.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	public User getUser(String username){
		return loginDao.getUser(username);
	}

	public void save(User user){
		loginDao.save(user);
	}

	public boolean findPersonByUsername(String username){
		return true;
	}
}

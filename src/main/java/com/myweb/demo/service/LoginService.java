package com.myweb.demo.service;

import com.myweb.demo.domain.User;

public interface LoginService {

	User getUser(String username);

	boolean findPersonByUsername(String username);

	void save(User user);

}

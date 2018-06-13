package com.myweb.demo.controller;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myweb.demo.domain.User;
import com.myweb.demo.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/checktoken", method = RequestMethod.GET)
	public String checkToken() {
        return "token is already";
    }

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user) throws ServletException {
		if (user.getUsername() == "" || user.getUsername() == null
                || user.getPassword() == "" || user.getPassword() == null){
			throw new ServletException("Username or Password invalid!");
		}
		if(loginService.findPersonByUsername(user.getUsername())){
			throw new ServletException("Username is used!");
		}
		loginService.save(new User(user.getUsername(), DigestUtils.md5DigestAsHex(user.getPassword().getBytes())));
        return "Register Success!";
    }
	
}

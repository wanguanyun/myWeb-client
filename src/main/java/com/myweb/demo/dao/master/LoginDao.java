package com.myweb.demo.dao.master;

import org.apache.ibatis.annotations.Param;

import com.myweb.demo.domain.User;

public interface LoginDao {

	User getUser(@Param("username") String username);

	void save(@Param("user") User user);

}

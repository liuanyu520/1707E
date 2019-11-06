package com.lay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lay.bean.User;
import com.lay.mapper.UserMapper;
@Service
public class UserServiceimpi implements UserService {
	@Autowired
	private UserMapper mapper;
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}

}

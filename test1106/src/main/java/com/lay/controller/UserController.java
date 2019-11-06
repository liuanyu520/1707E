package com.lay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lay.bean.User;
import com.lay.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping("list.do")
	public String list(Model m) {
		List<User> list = service.list();
		m.addAttribute("list",list);
		return "list";
	}
}

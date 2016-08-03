package com.sfpay.hybrid.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gateway.model.User;
import com.gateway.service.IUserService;

@Controller
@RequestMapping(value="/")
public class IndexController{
	 
	@Autowired
	private IUserService userservice;
	
	 @RequestMapping(value="/{code}")
     public void testError(@PathVariable int code,HttpServletRequest request,HttpServletResponse response) throws IOException {
		 response.sendError(code);
     }
	 
	 @RequestMapping(value="/login")
	 public void login(User user,HttpServletResponse response) throws IOException{
		User u=userservice.login(user.getName(), user.getPassword());
		if(u!=null){
			response.getWriter().append("登陆成功［user:").append(u.getName()).append(u.getPassword()).append("]").println();
		}else{
			response.getWriter().append("登陆失败").println();
		}
	 }
	 
	 @RequestMapping(value="/reg")
	 public void reg(User user,HttpServletResponse response) throws IOException{
		 if(userservice.reg(user.getName(), user.getPassword())){
			 response.getWriter().append("注册成功［user:").append(user.getName()).append(user.getPassword()).append("]").println();
		 }else{
			 response.getWriter().append("注册失败").println();
		 }
		 
	 }
	 
	 @RequestMapping(value="/logout")
	 public void logout(String name,HttpServletResponse response) throws IOException{
		 if(userservice.logout(name)){
			 response.getWriter().append("退出成功").println();
		 }
	 }
}

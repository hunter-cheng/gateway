package com.sfpay.hybrid.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class IndexController{
	 
	 @RequestMapping(value="/{code}")
     public void testError(@PathVariable int code,HttpServletRequest request,HttpServletResponse response) throws IOException {
		 response.sendError(code);
     }
}

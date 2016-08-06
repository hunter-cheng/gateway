package com.gateway.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.gateway.model.User;
import com.gateway.service.IUserService;

@ContextConfiguration(locations={"classpath:classpath:hessian/application-*.xml"})  
public class AddServiceTest {  
      
    @Autowired  
    IUserService userService;  
  
    @Test  
    public void test() {  
        User r = userService.login("test", "test");  
        System.out.println("The result is " + r.getId());  
    }  
}  
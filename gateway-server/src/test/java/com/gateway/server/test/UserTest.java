package com.gateway.server.test;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gateway.dao.UserDao;
import com.gateway.model.User;



public class UserTest {

	    

		@Test  
	    public void testCreateUser(){
			 ApplicationContext 
			 context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
			 UserDao userDao = (UserDao)context.getBean("userDao"); 
	    	User u=new User();
	    	u.setName("aaaa");
	    	u.setPassword("11111");
	    	userDao.createUser(u);
	    }  
}

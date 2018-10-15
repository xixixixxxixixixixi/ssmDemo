package cn.temptation.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.temptation.dao.usersMapper;
import cn.temptation.domain.users;

/**
 * ÓÃ»§¿ØÖÆÆ÷
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    
   

    @RequestMapping("/test")
    public String view() {
        return "sucess";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "main/index";
    }

    @RequestMapping(value = "/login")
    public String login() {
        
		 
        
       
        	return "fail";
        
    }
}
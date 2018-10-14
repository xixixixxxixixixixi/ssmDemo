package cn.temptation.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.temptation.dao.userMapper;
import cn.temptation.domain.user;

/**
 * ÓÃ»§¿ØÖÆÆ÷
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private userMapper usermapper;

    @RequestMapping("/test")
    public String view() {
        return "sucess";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "main/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(user model, HttpSession session) {
        
		user user = usermapper.selectByPrimaryKey(10);
        System.out.println(user.getSex());
       
        	return "fail";
        
    }
}
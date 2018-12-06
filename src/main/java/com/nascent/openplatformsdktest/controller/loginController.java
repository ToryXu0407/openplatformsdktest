package com.nascent.openplatformsdktest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/12/4
 * Time:14:12
 */
@Controller
@RequestMapping("/user")
public class loginController {
    @RequestMapping(value="/login_view",method = RequestMethod.GET)
    public String login23(HttpServletRequest request){
        return "user/login_view";
    }
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login2(HttpServletRequest request){
        request.getSession().setAttribute("session_user","toryxu");
        return "forward:/index";
    }
}

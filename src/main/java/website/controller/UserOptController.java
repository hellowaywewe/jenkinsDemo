package website.controller;

import common.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import website.pojo.User;
import website.service.UserOptService;

@Controller
public class UserOptController {
    @Autowired
    private UserOptService userOptService;

    @RequestMapping("/index")
    public String index(String userName){
        return "index";
    }

    @RequestMapping("/doRegister")
    public String doRegister(String userName, String userPwd){
        User user = new User(userName, userPwd);
        userOptService.userRegister(user);
        return "/login";
    }

    @RequestMapping("/doLogin")
    public ResultUtil doLogin(String userName, String userPwd){
        User user = userOptService.userLogin(userName, userPwd);
        if(user != null){
            return new ResultUtil(200, "login success", user);
        }
        return new ResultUtil(400, "login fail", null);
    }

}

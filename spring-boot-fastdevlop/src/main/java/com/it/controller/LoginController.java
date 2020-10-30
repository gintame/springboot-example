package com.it.controller;

import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

//    EmbeddedWebServerFactoryCustomizerAutoConfiguration
//    ConfigurableServletWebServerFactory

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {
        if (!StringUtils.isEmpty(username) && password.equals("123456")) {
            session.setAttribute("loginUser", username);
            return "redirect:/dashboard.html";
        }

        model.addAttribute("msg", "用户名或密码错误");
        throw new RuntimeException();
//        return "redirect:/";
    }

}

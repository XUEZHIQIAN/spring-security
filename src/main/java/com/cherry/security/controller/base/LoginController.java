package com.cherry.security.controller.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * LoginController
 *
 * @author Hang W
 */
@RestController
public class LoginController {

    @GetMapping("login")
    public String login(HttpServletRequest request) {
        return "welcome " + request.getParameter("username");
    }

    @GetMapping("logout")
    public String logout(HttpServletRequest request) {
        return "farewell " + request.getParameter("username");
    }

    @GetMapping("error")
    public String error(HttpServletRequest request) {
        return "error " + request.getParameter("username");
    }


}

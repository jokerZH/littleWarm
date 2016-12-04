package com.littlewarm.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SessionServlet {

    @RequestMapping(value="/test",produces="application/json; charset=utf-8")
    @ResponseBody
    public String startSession(HttpServletRequest request) {
        String jobName = request.getParameter("hehe");

        return "hello";
    }
}

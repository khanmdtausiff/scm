package com.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String getHome()
    {
        System.out.println("Inside Home Page");
        return "home";
    }

    @RequestMapping("/about")
    public String getAbout()
    {
        System.out.println("Inside About Page");
        return "about";
    }

    @RequestMapping("/service")
    public String getService()
    {
        System.out.println("Inside  Service Page");
        return "service";
    }

}

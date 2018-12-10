package com.example.LearnProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private LoginService service;

   // @RequestMapping(value="/login", method = RequestMethod.GET)
    //public String showLoginPage(ModelMap model){
    //    return "login";
    //}

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView login(){
            ModelAndView model = new ModelAndView();
            model.setViewName("login");
            return model;
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }

    @RequestMapping("/")
    public String sayHello() {
        return "Hello Spring Boot!!";
    }

    @RequestMapping(value="/cvscalculator", method = RequestMethod.GET)
    public ModelAndView cvscalculator(){
        ModelAndView model = new ModelAndView();
        model.setViewName("cvscalculator");
        return model;
    }

}
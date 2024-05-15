package com.Lab_5.SimpleWebApp4.controller;

import com.Lab_5.SimpleWebApp4.entity.User;
import com.Lab_5.SimpleWebApp4.service.DepartmentService;
import com.Lab_5.SimpleWebApp4.service.WorkerService;
import com.Lab_5.SimpleWebApp4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String RegisterForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String Register(@ModelAttribute("user") User user){
        user.setRole("user");
        userService.addUser(user);
        return "redirect:/user";
    }
}

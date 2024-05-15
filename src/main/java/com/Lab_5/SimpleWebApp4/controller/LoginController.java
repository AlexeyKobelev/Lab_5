package com.Lab_5.SimpleWebApp4.controller;

import com.Lab_5.SimpleWebApp4.entity.Department;
import com.Lab_5.SimpleWebApp4.entity.Worker;
import com.Lab_5.SimpleWebApp4.entity.User;
import com.Lab_5.SimpleWebApp4.service.DepartmentService;
import com.Lab_5.SimpleWebApp4.service.WorkerService;
import com.Lab_5.SimpleWebApp4.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private WorkerService workerService;
    @Autowired
    private DepartmentService departmentService;
    @GetMapping(value = "/")
    public String LoginForm(Model model){
        model.addAttribute("user", new User());
        return "index";
    }
    @RequestMapping (value = "/login", method = RequestMethod.POST )
    public String Login(@ModelAttribute("user") User user, HttpSession session){
        User autUser = userService.findByUserName(user.getName());
        if(autUser != null && autUser.getPassword().equals(user.getPassword())){
            session.setAttribute("user", autUser);
            if(autUser.getRole().equals("admin")){
                return "redirect:/admin";
            }else {
                return "redirect:/user";
            }
        }else {
            return "index";
        }
    }
    @RequestMapping("/user")
    public String user(Model model, HttpSession session){
        if(session.getAttribute("user") != null){
            List<Department> departments =departmentService.findAllDepartments();
            model.addAttribute("departments", departments);
            return "user";
        }
        return "redirect:/";
    }
    @RequestMapping("/admin")
    public String admin(Model model, HttpSession session){
        if(session.getAttribute("user") != null){
            List<Worker> workers = workerService.findAllWorker();
            model.addAttribute("worker", workers);
            return "admin";
        }
        return "redirect:/";
    }
}

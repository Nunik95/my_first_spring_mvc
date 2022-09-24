/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurana.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
//Employee emp=new Employee();
//emp.setName("Nurana");
//emp.setSurname("Ibragimova");
//emp.setSalary(10000);
//model.addAttribute("employee", emp);

        return "ask-emp-details-view";
    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName=request.getParameter("employeeName");
//        empName="Mr "+empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " is our new Employee");
//        return "show-emp-details-view";
//    }
    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
            BindingResult bindingResult) {
       if (bindingResult.hasErrors())  return "ask-emp-details-view";
       else return "show-emp-details-view";
    }
}

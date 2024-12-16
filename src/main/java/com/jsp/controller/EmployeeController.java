package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employees;
import com.jsp.dto.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao dao;

    @RequestMapping("/emp")
    public ModelAndView getEmployeeForm(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("employee", new Employees());
        mv.setViewName("create.jsp");
        return mv;
    }
    @RequestMapping("/save")
    @ResponseBody
    public String saveEmployee(@ModelAttribute Employees employee){
        dao.savedEmployee(employee);
        return "employee details added successfully";
    }
}

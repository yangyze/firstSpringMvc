package com.yyz.controller;

import com.yyz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by yangyeze on 2017/4/20.
 */
@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    private final String STUDENT_PAGE = "student";
    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model){
        model.addAttribute("list", studentService.getAll());

        return STUDENT_PAGE;
    }
}

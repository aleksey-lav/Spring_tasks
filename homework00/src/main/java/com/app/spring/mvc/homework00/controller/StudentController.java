package com.app.spring.mvc.homework00.controller;

import com.app.spring.mvc.homework00.model.Student;
import com.app.spring.mvc.homework00.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/students")
    public class StudentController {
        @RequestMapping(value = "/student", method = RequestMethod.GET)
       public String index() {
            return "index.html";
        }
        @Autowired
        private StudentService studentService;
        @RequestMapping(value = "/list", method = RequestMethod.GET)
        public @ResponseBody
        List<Student> getAllUsers() {
        return studentService.getAllStudens();
    }





/////////




//        @RequestMapping(value = "developer", method = RequestMethod.GET)
//        public ModelAndView developer() {
//            return new ModelAndView("developer", "command", new Developer());
//        }


}

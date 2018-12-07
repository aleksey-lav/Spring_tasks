package com.app.spring.mvc.homework00.service;

import com.app.spring.mvc.homework00.dao.StudentDAO;
import com.app.spring.mvc.homework00.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



    @Service
    public class StudentService {
        @Autowired
        private StudentDAO studentDAO;

        public List<Student> getAllStudens() {
            return studentDAO.getAllStudents();
        }
    }



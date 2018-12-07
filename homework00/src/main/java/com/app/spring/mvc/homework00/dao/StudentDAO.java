package com.app.spring.mvc.homework00.dao;

import com.app.spring.mvc.homework00.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDAO {

    public List<Student> students = Arrays.asList(
            new Student("Alex", 2, "Fs4"),
            new Student("Sergey", 5, "Fs5"),
            new Student("Alexandr", 5, "Fs5"),
            new Student("Zozich", 3, "PS4"),
            new Student("Roman", 4, "FE2"));

    public List<Student> getAllStudents() {
        return students;
    }
}

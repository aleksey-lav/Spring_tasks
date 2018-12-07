package com.app.spring.mvc.homework00.model;

public class Student {
    private String name;
    private int marks;
    private String nameOfGroup;

    public Student(){};

    public Student(String name, int marks, String nameOfGroup){
      this.name = name;
      this.marks = marks;
      this.nameOfGroup = nameOfGroup;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                '}';
    }
}



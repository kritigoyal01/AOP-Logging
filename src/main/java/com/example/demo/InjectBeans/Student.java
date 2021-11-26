package com.example.demo.InjectBeans;

public class Student implements People{
    public boolean printDetails(String fname, String lname) {
        System.out.println("Student first name: "+fname+ " and last name="+lname);
        return true;
    }
}

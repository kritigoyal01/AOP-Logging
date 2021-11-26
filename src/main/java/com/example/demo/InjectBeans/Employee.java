package com.example.demo.InjectBeans;

public class Employee implements People{
    public boolean printDetails(String fname, String lname) {
        System.out.println("Employee first name: "+fname+ " and last name="+lname);
        return true;
    }

}

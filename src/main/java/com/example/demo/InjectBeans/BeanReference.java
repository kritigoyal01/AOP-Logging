package com.example.demo.InjectBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class BeanReference {
    private  final List<People> peopleList;

    @Autowired
    public BeanReference(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public void processDetails(String fname, String lname){

        this.peopleList.forEach(peopleList->System.out.println(peopleList.printDetails(fname,lname)));
    }

    public void listImplementations() {
        System.out.println("Test");
        peopleList
                .forEach(peopleList -> System.out.println(peopleList.getClass()));
    }
}

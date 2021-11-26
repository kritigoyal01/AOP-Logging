package com.example.demo;

import com.example.demo.InjectBeans.BeanReference;
import com.example.demo.InjectBeans.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        //student.printThrowException();
        AnnotationConfigApplicationContext context1 =  new AnnotationConfigApplicationContext(Config.class);
        BeanReference beanReference = context1.getBean(BeanReference.class);
        beanReference.listImplementations();
        beanReference.processDetails("kriti","goyal");
    }

}

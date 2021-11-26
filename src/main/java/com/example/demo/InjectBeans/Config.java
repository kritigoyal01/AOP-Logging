package com.example.demo.InjectBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.InjectBeans")
public class Config {
        @Bean
        public Employee getEmployee(){
            return  new Employee();
        }

//        @Bean
//        public Student getStudent() {
//            return new Student();
//        }
}

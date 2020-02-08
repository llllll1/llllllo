package com.bdqn.Test;


import com.bdqn.service.StudentService;
import com.bdqn.spring.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
//
//        helloSpring.print();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService)context.getBean("studentService");



        studentService.findStudent();
    }


}

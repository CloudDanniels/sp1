package cn.qphone.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-aop.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.study();
    }

}

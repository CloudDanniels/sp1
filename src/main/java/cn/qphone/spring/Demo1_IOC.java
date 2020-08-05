package cn.qphone.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1_IOC {
    public static void main(String[] args) {
        quickstart();
    }
    public static void quickstart(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        Person p = (Person) applicationContext.getBean("c1");
        p.showinfo();
        Person p2 = (Person) applicationContext.getBean("c2");
        p2.showinfo();
        Person p4 = (Person) applicationContext.getBean("c4");
        p4.showinfo();
        Person p3 = (Person) applicationContext.getBean("c3");
        p3.showinfo();


    }
}

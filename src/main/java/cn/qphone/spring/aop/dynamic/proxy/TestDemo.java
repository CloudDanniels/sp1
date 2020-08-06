package cn.qphone.spring.aop.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo {
    public static void main(String[] args) {
        ClassLoader classLoader = Star.class.getClassLoader();
        Class[] interfaces = {Person.class};
        final Star star = new Star();
        Person proxy = (Person) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method.invoke(star, args);
                System.out.println("proxy method is invoked");
                return proxy;
            }
        });
        proxy.spaek();
    }
}

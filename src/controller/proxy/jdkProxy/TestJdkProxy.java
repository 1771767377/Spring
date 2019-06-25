package controller.proxy.jdkProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestJdkProxy {

    @Test
    public void test(){

        Object target = new PersonServiceImpl();
        Transaction transaction = new Transaction();
        PersonServiceProxy proxy = new PersonServiceProxy(target,transaction);
        PersonService personService = (PersonService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),proxy);
        String value = personService.savePerson();
        System.out.println(value);
    }

}

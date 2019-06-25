package controller.proxy.cglibProxy;

import org.junit.Test;

public class CglibTest {

    @Test
    public void test(){
        CglibPersonServiceImpl personService = new CglibPersonServiceImpl();
        CglibTransaction transaction = new CglibTransaction();
        CglibPersonProxy proxy = new CglibPersonProxy(personService,transaction);
        PersonSerivce personSerivce = (PersonSerivce) proxy.createProxy();
        String value = personSerivce.savePerson();
        System.out.println(value);
    }

}

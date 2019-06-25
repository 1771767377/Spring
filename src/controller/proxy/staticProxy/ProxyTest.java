package controller.proxy.staticProxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {

    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        PersonService personService = (PersonService) context.getBean("personServiceProxy");
        personService.savePerson();

    }

}

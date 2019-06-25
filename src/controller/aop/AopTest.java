package controller.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        PersonService personService = (PersonService) context.getBean("personService");
        String value = personService.savePerson();
        System.out.println(value);
    }

}

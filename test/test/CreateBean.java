package test;

import model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class CreateBean {

    @Test
    public void testBean1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        //默认无参构造
        User user = (User)context.getBean("user");
        System.out.println(user.toString());
    }

    @Test
    public void testBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        //静态工厂创建bean实例
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }

    @Test
    public void testBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        //实例工厂创建bean实例
        User user = (User) context.getBean("user2");
        System.out.println(user);
    }

    @Test
    public void testJdbc() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:resources.properties");
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());

    }


}

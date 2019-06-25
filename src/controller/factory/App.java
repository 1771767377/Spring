package controller.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MessageService;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("context 启动成功");
        //从context中取出 bean ，而不是用new MessageServiceImpl这种方式
        MessageService messageService = context.getBean(MessageService.class);
        //将这句输出一下
        System.out.println(messageService.getMessage());
    }

}

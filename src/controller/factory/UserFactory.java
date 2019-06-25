package controller.factory;

import model.User;

public class UserFactory {

    //静态工厂调用
    //必须是静态方法
    public static User userFactory(){
        return new User();
    }

    //实例工厂调用
    //普通方法
    public User userFactory1(){
        return new User();
    }

}

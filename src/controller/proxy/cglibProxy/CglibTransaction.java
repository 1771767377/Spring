package controller.proxy.cglibProxy;

public class CglibTransaction {

    public void beginTransaction(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }

}

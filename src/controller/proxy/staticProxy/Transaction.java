package controller.proxy.staticProxy;

public class Transaction {

    public void beginTransaction(){
        System.out.println("开启事务");
    }

    public void commitTransaction(){
        System.out.println("提交事务");
    }

}

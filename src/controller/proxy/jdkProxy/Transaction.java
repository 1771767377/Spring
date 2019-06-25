package controller.proxy.jdkProxy;

public class Transaction {

    public void BeginTransaction(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("关闭事务");
    }

}

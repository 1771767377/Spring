package controller.aop;

public class AopTransaction {

    public void beginTransaction(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }

}

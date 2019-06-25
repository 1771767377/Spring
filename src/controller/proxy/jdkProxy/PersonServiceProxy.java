package controller.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonServiceProxy implements InvocationHandler {

    //目标类
    private Object target;
    //增强类
    private Transaction transaction;

    //将目标类和增强类注入构造函数
    PersonServiceProxy(Object target,Transaction transaction){
            this.target = target;
            this.transaction = transaction;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.transaction.BeginTransaction();
        Object returnValue = method.invoke(this.target,args);
        this.transaction.commit();

        return returnValue;
    }
}

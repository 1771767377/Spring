package controller.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibPersonProxy implements MethodInterceptor {

    //目标类
    private Object target;
    //增强类
    private CglibTransaction transaction;

    //注入目标类与增强类
    public CglibPersonProxy(Object target,CglibTransaction transaction){
        this.target = target;
        this.transaction = transaction;
    }

    public Object createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object a, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        CglibTransaction transaction = new CglibTransaction();
        transaction.beginTransaction();
        Object value = method.invoke(this.target,objects);
        transaction.commit();
        return value;
    }
}

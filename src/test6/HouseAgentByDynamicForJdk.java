package test6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HouseAgentByDynamicForJdk implements InvocationHandler {
    Class<?> owner=null;
    Object obj= null;
    public HouseAgentByDynamicForJdk(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(this.obj,args);

        return result;
    }
}

package test6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class HouseBuyer {
    public static void main(String[] args){
        IHouseOwner owner=new HouseOwner();
        InvocationHandler handler=new HouseAgentByDynamicForJdk(owner);
        ClassLoader c1=owner.getClass().getClassLoader();
        IHouseOwner proxy=(IHouseOwner) Proxy.newProxyInstance(c1,new Class[]{IHouseOwner.class},handler);
        proxy.tradeHouse();
    }
}

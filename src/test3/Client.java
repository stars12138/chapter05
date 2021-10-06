package test3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Throwable{
        IGamePlayer player=new GamePlayer("zxx");
        InvocationHandler handler=new GamePlayIH(player);
        ClassLoader c1=player.getClass().getClassLoader();
        IGamePlayer proxy=(IGamePlayer) Proxy.newProxyInstance(c1,new Class[]{IGamePlayer.class},handler);
        proxy.login("zxxx","123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}

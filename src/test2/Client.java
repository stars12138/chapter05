package test2;

public class Client {
    public static void main(String[] args){
        IGamePlayer gamePlayer=new GamePlayer("zxx");
        GamePlayerProxy gameProxy=new GamePlayerProxy(gamePlayer);
        gameProxy.login("zxx","123456");
        gameProxy.killBoss();
        gameProxy.upgrade();
        gameProxy.count();
    }
}

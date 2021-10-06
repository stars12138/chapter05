package test2;

public class GamePlayerProxy implements IGamePlayer,IProxy{
    private IGamePlayer iGamePlayer;
    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.iGamePlayer=gamePlayer;
    }
    @Override
    public void login(String user, String password) {
            this.iGamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }

    @Override
    public void count() {
        System.out.println("获得金币");
    }
}

package test2;

public class GamePlayer implements IGamePlayer{
    private String name;
    public GamePlayer(String name){
        this.name=name;
    }
    @Override
    public void login(String user, String password) {
        System.out.println(this.name+"登录");
    }

    @Override
    public void killBoss() {
        System.out.println("刷怪");
    }

    @Override
    public void upgrade() {
        System.out.println("升级");
    }
}

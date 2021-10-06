package test5;

public class HouseAgentByStaticForInterface implements IHouseOwner{
    private IHouseOwner owner;
    public HouseAgentByStaticForInterface(IHouseOwner owner){
        this.owner=owner;
    }
    @Override
    public void tradeHouse() {
        this.owner.tradeHouse();
    }
}

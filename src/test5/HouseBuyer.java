package test5;

public class HouseBuyer {
    public static void main(String[] args){
        IHouseOwner iHouseOwner=new HouseOwner();
        IHouseOwner iHouseOwner1=new HouseAgentByStaticForInterface(iHouseOwner);
        iHouseOwner1.tradeHouse();
    }
}

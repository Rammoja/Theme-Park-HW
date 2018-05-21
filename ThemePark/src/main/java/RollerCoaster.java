public class RollerCoaster extends Rides{

    private String name;
    private int price;


    public RollerCoaster(String name, int minHeight, int minAge, int price) {
        super("ThunderBall", 4, 6,10);
        this.name = name;
        this.price = price;
    }


    public String getName(){

        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

}

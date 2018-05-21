public class BumperCars extends Rides{

    private String name;
    private int price;

    public BumperCars(String name, int price) {
        super("Samson", 4, 5, 7);
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

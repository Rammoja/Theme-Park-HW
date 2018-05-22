public class BumperCars extends Rides{

    private String name;

    public BumperCars(String name) {
        super("Samson", 4, 5, 7);
        this.name = name;
    }


    public String getName(){

        return this.name;
    }


}

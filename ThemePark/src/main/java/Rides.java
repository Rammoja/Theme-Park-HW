public abstract class Rides {

    private String ride;
    private int minHeight;
    private int minAge;
    private int price;


    public Rides(String ride, int minHeight, int minAge, int price) {
        this.ride = ride;
        this.minHeight = minHeight;
        this.minAge = minAge;
        this.price = price;
    }


    public int getMinAge(){
        return this.minAge;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMinHeight(){
        return this.minHeight;
    }


}

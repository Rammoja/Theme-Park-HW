public class RollerCoaster extends Rides{

    private String name;



    public RollerCoaster(String name) {
        super("ThunderBall", 4, 6,10);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}

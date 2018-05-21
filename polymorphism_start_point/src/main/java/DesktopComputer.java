public class DesktopComputer implements IConnect{
    private String name;
    private String make;
    private String model;

    public DesktopComputer(String name, String make, String model) {
        this.name = name;
        this.make = make;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String connectionStatus(String network){
        return String.format("computer %s connected to network %s.", this.name, network);
    }
}

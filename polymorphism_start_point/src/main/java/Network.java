import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect>devices;
    private int maxSlots;


    public Network(String name){
        this.devices = new ArrayList<>();
        this.name = name;
        this.maxSlots = 4;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (this.devices.size() <= devices.size())
        devices.add(device);
    }

    public void disconnectAll(){
        devices.clear();
    }


}
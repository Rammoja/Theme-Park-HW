public class InternetRadio implements IConnect{



    public String tune(String data) {
        return "tune: " + data;
    }


    public String connectionStatus(String network) {
        return String.format("Internet Radio connected to network %s.", network);
    }



}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        OutputDevice outDev=new OutputDevice();
        InputDevice inputDevice = new InputDevice();
        Application app = new Application(inputDevice,outDev);
        app.run();
    }
}
import java.util.Random;
public class InputDevice {

    public String getType() {
        return "random";
    }

    public int nextInt() {
        Random random = new Random();
        return random.nextInt(100)+1;
    }
}
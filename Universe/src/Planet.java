public class Planet extends Solar_Sistem{
    private String name;
    private int rotationSpeed;
    private int diameter;
    private Moon[] moons;
    public Planet(String name, int rotationSpeed) {
        super();
        this.name = name;
        this.rotationSpeed = rotationSpeed;
    }

    public Planet(Planet planets, String name, int numberOfPlanets) {
        //super(planets, name, numberOfPlanets);
    }


    public String getName() {
        return name;
    }
    public int getRotationSpeed() {
        return rotationSpeed;
    }
    public int computeDayDuration(int rotationSpeed) {

        return rotationSpeed+diameter;
    }
}

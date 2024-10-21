public class Solar_Sistem {
    //Solar_Sistem(Planet panet);
    public Planet[] planets;
    private String name;
    private String sun;
    private int numberOfPlanets;
    public Solar_Sistem(String sun,Planet planet, String name, int numberOfPlanets) {
        this.sun = sun;
        this.planets = planets;
        this.name = name;
        this.numberOfPlanets = numberOfPlanets;
    }

    public Solar_Sistem() {

    }
}

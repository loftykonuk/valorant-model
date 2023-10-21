package model;

public enum Agent {
    REYNA("Reyna", "Mexico", "Duelist"),
    CYPHER("Cypher", "Morocco", "Sentinel"),
    JETT("Jett", "South Korea", "Duelist"),
    FADE("Fade", "Turkey", "Initiator");

    private final String name;

    private final String country;

    private final String roll;

    Agent(String name, String country, String roll){
        this.name = name;
        this.country = country;
        this.roll=roll;
    }

    public String getRoll() {
        return roll;
    }

    public String getCountry() {
        return country;
    }

    public String getName(){
        return name;
    }
}

package model;

public enum Agent {
    REYNA("Reyna", "Mexico", "Duelist"),
    CYPHER("Cypher", "Morocco", "Sentinel"),
    JETT("Jett", "South Korea", "Duelist"),
    FADE("Fade", "Turkey", "Initiator"),
    GEKKO("Gekko","United States", "Initiator"),
    DEADLOCK("Deadlock","Norway","Sentinel"),
    HARBOR("Harbor","India", "Controller"),
    NEON("Neon", "Philippines", "Duelist"),
    KAYO("Kay/O", "China", "Initiator"),
    ASTRA("Astra", "Ggana", "Controller"),
    SAGE("Sage", "China", "Sentinel"),
    YORU("Yoru", "Japan", "Duelist"),
    SKYE("Skye", "Australia","Initiator"),
    RAZE("Raze", "Mexico", "Duelist"),
    OMEN("Omen","None", "Controller"),
    BREACH("Breach", "Sweden", "Initiator"),
    KILLJOY("Killjoy" ,"Germany", "Sentinel"),
    VIPER("Viper", "United States" , "Controller"),
    SOVA("Sova", "Russia", "Initiator"),
    PHOENIX("Phoenix", "England", "Duelist");

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

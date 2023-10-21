package model;

public class User {
    private String password;

    private final String username;

    private int gameCredits;

    public User(String username, String password) {
        this.username=username;
        this.password=password;
        this.gameCredits=0; // credits are 0 when account first created.
    }

    public void setGameCredits(int gameCredits) {
        this.gameCredits = gameCredits;
    }

    public int getGameCredits() {
        return gameCredits;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    //there is no username bcs you can't change your username. I am not sure tho :).
    public String getUsername(){
        return username;
    }
}

package model;

public enum Map {
    HAVEN("Haven"),
    BIND("Bind"),
    ASCENT("Ascent"),
    ICEBOX("Icebox"),
    SUNSET("Sunset"),
    LOTUS("Lotus"),
    PEARL("Pearl"),
    FRACTURE("Fracture"),
    BREEZE("Breeze"),
    SPLIT("Split");

    private String name;

    Map(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

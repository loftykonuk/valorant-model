package model;

public enum Weapon {
    MELEE(75, 0, "Knife"),
    CLASSIC(25, 0, "Sidearm"),
    SHORTY(11, 300, "Sidearm"),
    FRENZY(26, 450, "Sidearm"),
    GHOST(30, 500, "Sidearm"),
    SHERIFF(50, 800, "Sidearm"),
    STINGER(27, 1100, "SMG"),
    SPECTRE(26, 1600, "SMG"),
    BUCKY(20, 850, "Shotgun"),
    JUDGE(7, 1850, "Shotgun"),
    BULLDOG(35, 2050, "Rifle"),
    GUARDIAN(65, 2250, "Rifle"),
    PHANTOM(39, 2900, "Rifle"),
    VANDAL(40, 2900, "Rifle"),
    MARSHAL(101, 950, "Sniper"),
    OPERATOR(150, 4700, "Sniper"),
    ARES(30, 1600, "Machine Gun"),
    ODIN(38, 3200, "Machine Gun");

    private final int price;
    private final int damage;
    private final String type;

    Weapon(int damage, int price, String type) {
        this.damage = damage;
        this.price = price;
        this.type = type;
    }

    public void hitEnemy(){
        System.out.println(damage + " damage has given to enemy");
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }
}
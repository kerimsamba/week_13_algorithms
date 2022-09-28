package Objects;

public enum Weapons {

    SWORD("sword", 4),
    AXE("axe", 3),
    CLUB("club", 2),
    DAGGER("dagger", 1);


    private final String name;
    private final int damage;


    Weapons(String name, int damage) {
        this.name = name;
        this.damage = damage;

    }
}

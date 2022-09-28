package Objects;

public enum Enemies {

    TROLL("troll", 2),
    ORC("orc", 1);

    private final String name;
    private final int toughnessMultiplier;

    Enemies(String name, int toughnessMultiplier) {
        this.name = name;
        this.toughnessMultiplier = toughnessMultiplier;
    }

}

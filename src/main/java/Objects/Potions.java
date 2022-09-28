package Objects;

public enum Potions {

    PURPLEPOTION("purple potion", 2),
    REDPOTION("red potion", 1);

    private final String name;
    private final int value;

    Potions(String name, int value) {
        this.name = name;
        this.value = value;

    }
}

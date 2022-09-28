package Objects;

public enum Treasure {

    DIAMOND("diamond", 2),
    GOLD("gold", 2),
    COIN("coin", 1);


    private final String name;
    private final int value;


    Treasure(String name, int value) {
        this.name = name;
        this.value = value;

    }

}

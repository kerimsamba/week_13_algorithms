package Players;

import Objects.Weapons;

public enum PlayerClass {

BARBARIAN("barbarian", Weapons.CLUB, 0, 0),
    DWARF("dwarf", Weapons.AXE, 0, 0),
    KNIGHT("knight", Weapons.SWORD, 0, 0),
    WIZARD("wizard", Weapons.DAGGER, 2, 1),
    WARLOCK("warlock", Weapons.SWORD, 1,1),
    CLERIC("cleric", Weapons.CLUB, 0,3);


    private final String name;
    private final Weapons preferredWeapon;
    private final int spellModifier;
    private final int healModifier;

    PlayerClass(String name, Weapons weapon, int spellModifier, int healModifier){
        this.name = name;
        this.preferredWeapon = weapon;
        this.spellModifier = spellModifier;
        this.healModifier = healModifier;

    }

}

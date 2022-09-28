package Rooms;

import Objects.*;
import Players.PlayerClass;

import java.util.ArrayList;

public class DungeonRoom {

    private String name;
    private ArrayList<Weapons> weapons;
    private ArrayList<Treasure> treasures;
    private ArrayList<Potions> potions;
    private ArrayList<Enemies> enemies;
    private ArrayList<Familiars> familiars;


    public DungeonRoom(String name){
        this.name = name;
        this.weapons = new ArrayList<Weapons>();
        this.treasures = new ArrayList<Treasure>();
        this.potions = new ArrayList<Potions>();
        this.enemies = new ArrayList<Enemies>();
        this.familiars = new ArrayList<Familiars>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapons weapon) {
        this.weapons.add(weapon);
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public ArrayList<Potions> getPotions() {
        return potions;
    }

    public void addPotion(Potions potion) {
        this.potions.add(potion);
    }

    public ArrayList<Enemies> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemies enemy) {
        this.enemies.add(enemy);
    }

    public ArrayList<Familiars> getFamiliars() {
        return familiars;
    }

    public void addFamiliar(Familiars familiar) {
        this.familiars.add(familiar);
    }
}

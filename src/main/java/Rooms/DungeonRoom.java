package Rooms;

import Objects.Enemies;
import Objects.Potions;
import Objects.Treasure;
import Objects.Weapons;
import Players.PlayerClass;

import java.util.ArrayList;

public class DungeonRoom {

    private String name;
    private ArrayList<Weapons> weapons;
    private ArrayList<Treasure> treasures;
    private ArrayList<Potions> potions;
    private ArrayList<Enemies> enemies;


    public DungeonRoom(String name){
        this.name = name;
        this.weapons = new ArrayList<Weapons>();
        this.treasures = new ArrayList<Treasure>();
        this.potions = new ArrayList<Potions>();
        this.enemies = new ArrayList<Enemies>();

    }



}

package Players;

import Objects.Potions;
import Objects.Treasure;
import Objects.Weapons;

import java.util.ArrayList;

public class Player {

        private String name;
        private PlayerClass playerClass;
        private int hitPoints;
        private ArrayList<Weapons> weapons;
        private ArrayList<Treasure> treasures;
        private ArrayList<Potions> potions;
        private String familiar;

    public Player(String name, PlayerClass playerClass, int hitPoints){
        this.name = name;
        this.playerClass = playerClass;
        this.hitPoints = hitPoints;
        this.weapons = new ArrayList<Weapons>();
        this.treasures = new ArrayList<Treasure>();
        this.potions = new ArrayList<Potions>();
        this.familiar = familiar;
        }
    }


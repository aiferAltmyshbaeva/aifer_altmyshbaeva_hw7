package pl.aifer.game;

import pl.aifer.game.character.Barrack;
import pl.aifer.game.character.HavingSuperAbility;
import pl.aifer.game.character.Hero;
import pl.aifer.game.character.Medic;

public class Main {
    public static void main(String[] args) {
        Hero[] heroArray = Barrack.createArmy();

        for (HavingSuperAbility superAbility : heroArray) {
            if (superAbility instanceof Medic medic) {
                medic.increaseExperience();
            }
            superAbility.applySuperAbility();
        }

    }


}
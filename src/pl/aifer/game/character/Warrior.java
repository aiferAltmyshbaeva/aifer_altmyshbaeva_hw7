package pl.aifer.game.character;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior applied: " + getSuperAbilityType());
    }
}

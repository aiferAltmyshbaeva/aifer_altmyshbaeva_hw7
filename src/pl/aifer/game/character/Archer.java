package pl.aifer.game.character;

public class Archer extends Warrior {
    @Override
    public void applySuperAbility() {
        System.out.println("Archer applied: " + getSuperAbilityType());
    }
}

package pl.aifer.game.character;

public class Freelancer extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Freelancer applied: " + getSuperAbilityType());
    }
}

package pl.aifer.game.character;

public class Magic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Magic applied: " + getSuperAbilityType());
    }
}

package pl.aifer.game.character;

public class Medic extends Hero {
    private int healPoints;

    public void increaseExperience() {
        healPoints += healPoints * 10 / 100;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied: " + getSuperAbilityType());
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}

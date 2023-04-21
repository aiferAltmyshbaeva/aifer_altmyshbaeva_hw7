package pl.aifer.game.character;

public class Barrack {
    public static Hero[] createArmy() {
        Magic magic = createMagic("CURSE");
        Medic medic = createMedic("HEAL");
        Warrior warrior = createWarrior("CRITICAL DAMAGE");
        Freelancer freelancer = createFreelancer("Javelin strike");
        Archer archer = createArcher("Deadly arrows");
        Hero[] heroArray = {magic, medic, warrior, freelancer, archer};
        return heroArray;
    }

    private static Archer createArcher(String superAbility) {
        Archer archer = new Archer();
        archer.setDamage(100);
        archer.setHealth(200);
        archer.setSuperAbilityType(superAbility);
        return archer;
    }

    private static Freelancer createFreelancer(String superAbility) {
        Freelancer freelancer = new Freelancer();
        freelancer.setDamage(100);
        freelancer.setHealth(200);
        freelancer.setSuperAbilityType(superAbility);
        return freelancer;
    }

    private static Warrior createWarrior(String superAbility) {
        Warrior warrior = new Warrior();
        warrior.setHealth(120);
        warrior.setDamage(65);
        warrior.setSuperAbilityType(superAbility);
        return warrior;
    }

    private static Medic createMedic(String superAbility) {
        Medic medic = new Medic();
        medic.setHealth(70);
        medic.setDamage(35);
        medic.setSuperAbilityType(superAbility);
        medic.setHealPoints(10);
        return medic;
    }

    private static Magic createMagic(String superAbility) {
        Magic magic = new Magic();
        magic.setHealth(100);
        magic.setDamage(50);
        magic.setSuperAbilityType(superAbility);
        return magic;
    }
}

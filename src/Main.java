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
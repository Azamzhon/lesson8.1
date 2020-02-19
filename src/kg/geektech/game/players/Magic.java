package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {

        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(SuperAbility.BOOST) &&
                    this.getHealth() >= 0) {
                Random r = new Random();
                int randomM = r.nextInt(3) + 1;
                heroes[i].setDamage(heroes[i].getDamage() + randomM);
                System.out.println("Magic's boosted the heroes' damage " + (heroes[i].getDamage() + randomM));
            }
        }
    }
}
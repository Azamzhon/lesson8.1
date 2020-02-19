package kg.geektech.game.players;

import java.util.Random;

public class Golem extends Hero implements HavingSuperAbility {

    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.SHIELD);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            Random r = new Random();
            int randomShield = r.nextInt(50);

            System.out.println("Shield " + " hero " + heroes[i].getHealth() + " damage");
            System.out.println("____________________");

            if (heroes[5].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + randomShield);
                heroes[5].setHealth(heroes[5].getHealth() - randomShield);
            } else if (heroes[5].getHealth() <= 0) ;
        }
    }
}

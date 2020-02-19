package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero implements HavingSuperAbility {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random ra = new Random();
        int randomM = ra.nextInt(3);
        if (randomM == 1) {
            System.out.println("Thor stunned the Boss");
            System.out.println("_____________________");
            boss.setDamage(boss.getDamage() - 100);

        } else {
            boss.setDamage(100);
        }
    }
}

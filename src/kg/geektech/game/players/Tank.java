package kg.geektech.game.players;

import java.util.Random;

public class Tank extends Hero {

    public Tank(int health, int damage) {

        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int health = boss.getHealth() - boss.getDamage();
        boss.setHealth(health);
        System.out.println("Tank's reverted the hit");
    }
}

package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random ra = new Random();
        int randomW = ra.nextInt(3) + 2;
        int bossHealth = boss.getHealth() - (heroes[0].getDamage() * randomW);
        boss.setHealth(bossHealth);
        System.out.println("Warrior's dealt critical damage " + (heroes[0].getDamage() * randomW));
    }
}

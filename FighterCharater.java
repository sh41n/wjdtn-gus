package sf;

import java.util.Random;
class FighterCharacter {
    private String name;
    private int health;
    private int attackMin;
    private int attackMax;

    public FighterCharacter(String name, int health, int attackMin, int attackMax) {
        this.name = name;
        this.health = health;
        this.attackMin = attackMin;
        this.attackMax = attackMax;
    }

    public void attack(FighterCharacter opponent) {
        Random random = new Random();
        int damage = random.nextInt(attackMax - attackMin + 1) + attackMin;
        opponent.health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

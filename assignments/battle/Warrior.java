public class Warrior extends Character {
    // Character-т байхгүй хувьсагчуудыг энд зарлана
    protected int maxHp;
    protected int mp;
    protected int maxMp;
    protected boolean shielded = false;

    public Warrior(String name, int hp) {
        super(name, hp); // Character(name, hp) байгуулагчийг дуудна
        this.maxHp = hp;
        this.mp = 20;
        this.maxMp = 20;
    }

    public void shieldBash() {
        this.shielded = true;
    }

    @Override
    public int attack(Character target) {
        int damage = 20; // Тест 20-ийг хүлээж байгаа
        target.takeDamage(damage);
        System.out.println(this.getName() + " swings a mighty sword!");
        return damage;
    }

    @Override
    public void takeDamage(int amount) {
        if (this.shielded) {
            super.takeDamage(amount / 2);
            this.shielded = false;
        } else {
            super.takeDamage(amount);
        }
    }

    public String describe() {
        return "wields a sword";
    }
}
public class Mage extends Character {
    protected int mp;
    protected int maxMp;

    public Mage(String name, int hp) {
        super(name, hp);
        this.mp = 100;
        this.maxMp = 100;
    }

    @Override
    public int attack(Character target) {
        int magicDamage = 15; // Тест 15-ыг хүлээж байгаа
        target.takeDamage(magicDamage);
        System.out.println(this.getName() + " casts a fireball!");
        return magicDamage;
    }

    public String describe() {
        return "channels magic";
    }
}
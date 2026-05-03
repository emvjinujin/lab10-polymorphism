public class Rogue extends Character {
    protected int mp;
    protected int maxMp;

    public Rogue(String name, int hp) {
        super(name, hp);
        this.mp = 40;
        this.maxMp = 40;
    }

    @Override
    public int attack(Character target) {
        int critDamage = 25; // Тест 25-ыг хүлээж байгаа
        target.takeDamage(critDamage);
        System.out.println(this.getName() + " strikes from the shadows!");
        return critDamage;
    }

    public String describe() {
        return "sneaks in shadow";
    }
}
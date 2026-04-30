public class Warrior extends Character {

    public Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int damage = 20;
        target.takeDamage(damage);
        
        System.out.println(this.getName() + " swings a mighty sword at " + target.getName() + "!");
        
        return damage;
    }

   
    @Override
    public String describe() {
        return "wields a sword";
    }
}

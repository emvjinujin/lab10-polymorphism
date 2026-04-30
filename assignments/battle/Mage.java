public class Mage extends Character {

    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int magicDamage = 15;
        target.takeDamage(magicDamage);
     
        System.out.println(this.getName() + " casts a fireball at " + target.getName() + "!");
        
        return magicDamage;
    }

    public String describe() {
        return "channels magic";
    }
}

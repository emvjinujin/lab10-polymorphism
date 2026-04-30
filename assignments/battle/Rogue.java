public class Rogue extends Character {

    public Rogue(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int critDamage = 25;
        target.takeDamage(critDamage);
      
        System.out.println(this.getName() + " strikes from the shadows!");
        
        return critDamage;
    }

    public String describe() {
        return "sneaks in shadow";
    }
}

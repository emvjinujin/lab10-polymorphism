public class Battle {

    public static int partyAttack(Character[] party, Character enemy) {
        int totalDamage = 0;
        
        // Polymorphic loop: Character бүр өөр өөрийн attack-ийг ажиллуулна
        for (Character member : party) {
            if (member != null) {
                totalDamage += member.attack(enemy);
            }
        }
        
        return totalDamage;
    }

    // ─────── 🟡 Stretch (30 оноо) ───────

    public static String describeParty(Character[] party) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < party.length; i++) {
            if (party[i] != null) {
                sb.append(party[i].describe());

                if (i < party.length - 1) {
                    sb.append(" | ");
                }
            }
        }
        
        return sb.toString();
    }

    // ─────── 🔴 Bonus (10 оноо) ───────

    public static int countMages(Character[] party) {
        int count = 0;
        
        for (Character c : party) {
            if (c instanceof Mage m) {
                count++;
            }
        }
        
        return count;
    }
}

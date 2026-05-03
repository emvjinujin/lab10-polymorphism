public class Battle {

    public static int partyAttack(Character[] party, Character enemy) {
        int totalDamage = 0;
        if (party == null) return 0;
        for (Character member : party) {
            if (member != null) {
                totalDamage += member.attack(enemy);
            }
        }
        return totalDamage;
    }

    // ─────── 🟡 Stretch (30 оноо) ───────
    public static String describeParty(Character[] party) {
        if (party == null || party.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (Character c : party) {
            if (c != null) {
                // Өмнө нь текст нэмэгдсэн бол заавал тусгаарлагч нэмнэ
                if (!first) {
                    sb.append(" | ");
                }

                // Хамгийн чухал хэсэг: Character-г зөв төрөл рүү хөрвүүлж describe дуудах
                if (c instanceof Warrior w) {
                    sb.append(w.describe());
                } else if (c instanceof Mage m) {
                    sb.append(m.describe());
                } else if (c instanceof Rogue r) {
                    sb.append(r.describe());
                }

                first = false; // Эхний элемент бичигдсэн тул false болгоно
            }
        }
        return sb.toString();
    }

    // ─────── 🔴 Bonus (10 оноо) ───────
    public static int countMages(Character[] party) {
        int count = 0;
        if (party == null) return 0;
        for (Character c : party) {
            if (c instanceof Mage) {
                count++;
            }
        }
        return count;
    }
}
package latihan;

public class SkillGameRPG {
    public static void main(String[] args) {
        // Array skill RPG
        String[] skillNama = {"Fireball", "Ice Spike", "Thunder Strike", "Heal", "Power Slash"};
        int[] skillPower = {80, 70, 120, 60, 100};

        // Daftar skill
        System.out.println("=== Daftar Skill RPG ===");
        for (int i = 0; i < skillNama.length; i++) {
            System.out.println((i + 1) + ". " + skillNama[i] + " (Power: " + skillPower[i] + ")");
        }

        // Status musuh
        int hpMusuh = 300;
        System.out.println("\nHP awal musuh: " + hpMusuh);

        // Gunakan Thunder Strike (index 2)
        hpMusuh -= skillPower[2];

        System.out.println("Player menggunakan skill " + skillNama[2]);
        System.out.println("HP musuh setelah terkena serangan: " + hpMusuh);
    }
}

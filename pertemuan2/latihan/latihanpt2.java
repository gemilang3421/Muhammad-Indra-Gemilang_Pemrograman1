import java.util.Scanner;

public class PerkenalanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama           : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kelas          : ");
        String kelas = input.nextLine();

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Kelas          : " + kelas);

        System.out.println("Perkenalkan, saya " + nama + 
                           " kelas " + kelas + ".");

        input.close();
    }
}

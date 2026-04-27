import java.util.Scanner;

public class PerkenalanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama           : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM            : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Program Studi  : ");
        String prodi = input.nextLine();

        System.out.print("Masukkan Kelas          : ");
        String kelas = input.nextLine();

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Program Studi  : " + prodi);
        System.out.println("Kelas          : " + kelas);

        System.out.println("Perkenalkan, saya " + nama + 
                           " dengan NIM " + nim + 
                           " dari program studi " + prodi + 
                           " kelas " + kelas + ".");

        input.close();
    }
}

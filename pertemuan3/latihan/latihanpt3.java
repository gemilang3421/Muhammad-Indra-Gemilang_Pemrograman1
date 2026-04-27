// MUHAMMAD INDRA GEMILANG //

package latihan;

import java.util.Scanner;

public class SkorMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan SKS Mata Kuliah (2/3): ");
        int sks = input.nextInt();

        System.out.print("Masukkan Jumlah Kehadiran: ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        int totalKehadiran;

        
        if (sks == 2) {
            totalKehadiran = 14;
        } else if (sks == 3) {
            totalKehadiran = 21;
        } else {
            System.out.println("SKS tidak valid!");
            input.close();
            return;
        }

        
        if (kehadiran < 0 || kehadiran > totalKehadiran ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("Input tidak valid! Periksa kembali nilai.");
            input.close();
            return;
        }

        
        double skorKehadiran = ((double) kehadiran / totalKehadiran) * 100;

        
        double nilaiAkhir = (skorKehadiran * 0.2) + (uts * 0.4) + (uas * 0.4);

     
        String grade;
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 60) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Output
        System.out.println("\n======== HASIL ========");
        System.out.println("Nama             : " + nama);
        System.out.printf("Skor Kehadiran   : %.2f%%\n", skorKehadiran);
        System.out.printf("Nilai UTS        : %.2f\n", uts);
        System.out.printf("Nilai UAS        : %.2f\n", uas);
        System.out.printf("Nilai Akhir      : %.2f\n", nilaiAkhir);
        System.out.println("Grade            : " + grade);

        input.close();
    }
}

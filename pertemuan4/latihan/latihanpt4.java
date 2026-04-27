package latihan;

import java.util.Scanner;

public class DataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan SKS Mata Kuliah (2/3): ");
        int sks = input.nextInt();

        int realisasi;

        // Validasi SKS
        if (sks == 2) {
            realisasi = 14;
        } else if (sks == 3) {
            realisasi = 21;
        } else {
            System.out.println("SKS tidak valid!");
            input.close();
            return;
        }

        System.out.print("Masukkan jumlah kehadiran: ");
        int jumlahKehadiran = input.nextInt();

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = input.nextDouble();

        // Validasi input
        if (jumlahKehadiran < 0 || jumlahKehadiran > realisasi ||
            nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {

            System.out.println("Input tidak valid! Periksa kembali.");
            input.close();
            return;
        }

        // Proses (total bobot = 100)
        double bobotKehadiran = ((double) jumlahKehadiran / realisasi) * 10;
        double bobotTugas = nilaiTugas * 0.20;
        double bobotUTS = nilaiUTS * 0.30;
        double bobotUAS = nilaiUAS * 0.40;

        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

        // Grade
        String grade;
        if (total >= 85) {
            grade = "A";
        } else if (total >= 70) {
            grade = "B";
        } else if (total >= 60) {
            grade = "C";
        } else if (total >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Output
        System.out.println("\n============ HASIL ============");
        System.out.println("Jumlah Kehadiran : " + jumlahKehadiran);
        System.out.printf("Bobot Kehadiran  : %.2f\n", bobotKehadiran);
        System.out.printf("Bobot Tugas      : %.2f\n", bobotTugas);
        System.out.printf("Bobot UTS        : %.2f\n", bobotUTS);
        System.out.printf("Bobot UAS        : %.2f\n", bobotUAS);
        System.out.printf("Total Nilai      : %.2f\n", total);
        System.out.println("Grade            : " + grade);

        input.close();
    }
}

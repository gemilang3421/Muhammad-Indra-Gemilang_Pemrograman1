// Muhammad Indra Gemilang #241011400205

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kehadiran kamu: ");
        double kehadiran = input.nextDouble();

        System.out.print("Masukkan jumlah realisasi pertemuan: ");
        double realisasi = input.nextDouble();

        if (realisasi == 0) {
            System.out.println("Realisasi pertemuan tidak boleh 0!");
            return;
        }

        System.out.print("Masukkan bobot kehadiran (misal 20): ");
        double wKehadiran = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        // Perhitungan
        double bobotKehadiran = (kehadiran / realisasi) * wKehadiran;
        double bobotTugas = tugas * 0.20;
        double bobotUTS = uts * 0.30;
        double bobotUAS = uas * 0.30;

        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.printf("Bobot Kehadiran : %.2f\n", bobotKehadiran);
        System.out.printf("Bobot Tugas     : %.2f\n", bobotTugas);
        System.out.printf("Bobot UTS       : %.2f\n", bobotUTS);
        System.out.printf("Bobot UAS       : %.2f\n", bobotUAS);
        System.out.printf("Total Nilai     : %.2f\n", total);

        input.close();
    }
}

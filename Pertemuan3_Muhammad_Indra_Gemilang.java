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

        
        double bobotKehadiran = (kehadiran / realisasi) * wKehadiran;
        double bobotTugas = tugas * 0.20;
        double bobotUTS = uts * 0.30;
        double bobotUAS = uas * 0.30;

        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

    
        System.out.println("\n=== HASIL ===");
        System.out.printf("Bobot Kehadiran :", bobotKehadiran);
        System.out.printf("Bobot Tugas     :", bobotTugas);
        System.out.printf("Bobot UTS       :", bobotUTS);
        System.out.printf("Bobot UAS       :", bobotUAS);
        System.out.printf("Total Nilai     :", total);

        input.close();
    }
}

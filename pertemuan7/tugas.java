package tugas;

import java.util.Scanner;

public class PembelianTiketBioskopImproved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kasir Tiket Bioskop ===");
        System.out.print("Nama film       : ");
        String film = input.nextLine();

        System.out.print("Jumlah tiket    : ");
        int jumlahTiket = input.nextInt();

        System.out.print("Harga per tiket : ");
        double hargaTiket = input.nextDouble();

        double subtotal = jumlahTiket * hargaTiket;
        double diskon = jumlahTiket >= 5 ? subtotal * 0.10 : 0;
        double totalBayar = subtotal - diskon;

        System.out.println("\n=== Struk Pembelian ===");
        System.out.println("Film       : " + film);
        System.out.println("Subtotal   : Rp " + String.format("%,.0f", subtotal));
        System.out.println("Diskon     : Rp " + String.format("%,.0f", diskon));
        System.out.println("Total Bayar: Rp " + String.format("%,.0f", totalBayar));

        input.close();
    }

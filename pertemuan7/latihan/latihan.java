package latihan;

public class PembelianTiketBioskop {
    public static void main(String[] args) {
        String film = "Langit Senja";
        int jumlahTiket = 3;
        double hargaTiket = 45000;
        double totalBayar = jumlahTiket * hargaTiket;

        System.out.println("=== Pembelian Tiket Bioskop ===");
        System.out.println("Film         : " + film);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Harga Tiket  : Rp " + String.format("%,.0f", hargaTiket));
        System.out.println("Total Bayar  : Rp " + String.format("%,.0f", totalBayar));
    }
}

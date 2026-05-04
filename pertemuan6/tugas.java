package tugas;

class KendaraanDetail {
    String merk;
    String jenis;
    int tahun;
    double harga;

    KendaraanDetail(String merk, String jenis, int tahun, double harga) {
        this.merk = merk;
        this.jenis = jenis;
        this.tahun = tahun;
        this.harga = harga;
    }

    int hitungUsia(int tahunSekarang) {
        return tahunSekarang - tahun;
    }

    void tampilkanInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Jenis : " + jenis);
        System.out.println("Tahun : " + tahun);
        System.out.println("Harga : Rp " + String.format("%,.0f", harga));
    }
}

public class DataKendaraanImproved {
    public static void main(String[] args) {
        KendaraanDetail kendaraan = new KendaraanDetail("Toyota", "Mobil", 2020, 235000000);

        System.out.println("=== Detail Kendaraan ===");
        kendaraan.tampilkanInfo();
        System.out.println("Usia  : " + kendaraan.hitungUsia(2026) + " tahun");
    }
}

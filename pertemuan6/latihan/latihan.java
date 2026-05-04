package latihan;

class Kendaraan {
    String merk;
    String jenis;
    int tahun;

    void tampilkanInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Jenis : " + jenis);
        System.out.println("Tahun : " + tahun);
    }
}

public class DataKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.merk = "Honda";
        kendaraan.jenis = "Motor";
        kendaraan.tahun = 2022;

        System.out.println("=== Data Kendaraan ===");
        kendaraan.tampilkanInfo();
    }
}

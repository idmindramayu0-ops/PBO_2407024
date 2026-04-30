package latihan_pbo.latihan4_2407024;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // Constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        return getPanjang() * getLebar();
    }

    // Method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi; // pakai method dari parent
    }
}

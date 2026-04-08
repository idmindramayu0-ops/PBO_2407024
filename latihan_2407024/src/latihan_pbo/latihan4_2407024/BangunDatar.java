package latihan_pbo.latihan4_2407024;

public class BangunDatar {
    private double panjang;
    private double lebar;

    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}

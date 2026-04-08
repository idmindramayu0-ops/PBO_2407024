package latihan_pbo.latihan2_2407024;

public class coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;

    // setter panjang
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    // getter panjang
    public double getPanjang(){
        return panjang;
    }

    // setter lebar
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    // cetak luas langsung
    public void cetakLuas(){
        System.out.println("Luasnya adalah : " + (panjang * lebar));
    }

    // hitung luas dan return
    public double hitungLuas(){
        double luas = panjang * lebar;
        return luas;
    }
}
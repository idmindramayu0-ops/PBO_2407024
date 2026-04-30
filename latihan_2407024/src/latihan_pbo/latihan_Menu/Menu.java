package latihan_pbo.latihan_Menu;

public class Menu {
    protected String nama;
    protected int harga;

    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int hitungTotal() {
        return harga;
    }

    public void tampilkan() {
        System.out.println(nama + " - Rp" + harga);
    }
}
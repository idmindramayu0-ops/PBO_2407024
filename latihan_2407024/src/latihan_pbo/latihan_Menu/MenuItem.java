package latihan_pbo.latihan_Menu;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public int hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama + " | Harga: Rp" + harga +
                           " | Jumlah: " + jumlah +
                           " | Total: Rp" + hitungTotal());
    }
}
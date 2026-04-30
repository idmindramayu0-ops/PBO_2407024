
package latihan_pbo.latihan_Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // daftar menu
        Menu[] daftarMenu = {
            new Menu("Nasi Goreng", 12000),
            new Menu("Ketoprak", 15000),
            new Menu("Roti Bakar", 8000),
            new Menu("Mie Ayam", 10000)
        };

        ArrayList<MenuItem> pesanan = new ArrayList<>();

        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu[i].tampilkan();
        }

        String lanjut;
        do {
            System.out.print("\nPilih menu (1-" + daftarMenu.length + "): ");
            int pilih = input.nextInt();

            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();

            Menu menuDipilih = daftarMenu[pilih - 1];

            pesanan.add(new MenuItem(menuDipilih.nama, menuDipilih.harga, jumlah));

            System.out.print("Tambah pesanan lagi? (y/n): ");
            lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("y"));

        // tampilkan detail pesanan
        System.out.println("\n=== DETAIL PESANAN ===");
        int totalSemua = 0;

        for (MenuItem item : pesanan) {
            item.tampilkan();
            totalSemua += item.hitungTotal();
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL SEMUA PESANAN: Rp" + totalSemua);

        input.close();
    }
}

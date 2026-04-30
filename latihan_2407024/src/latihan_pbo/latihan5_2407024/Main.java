package latihan_pbo.latihan5_2407024;

public class Main {
    public static void main(String[] args) {

        // satu tipe variabel (polymorphism)
        BangunDatar bd;

        bd = new Persegi(4);
        bd.tampilkan();

        System.out.println();

        bd = new PersegiPanjang(10, 5);
        bd.tampilkan();

        System.out.println();

        bd = new Segitiga(6, 8);
        bd.tampilkan();
    }
    
}

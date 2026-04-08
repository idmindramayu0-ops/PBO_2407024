package latihan_pbo.latihan3_2407024;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.print("Pilih Bangun Datar : ");

        int pilih = input.nextInt();

        if(pilih == 1){
            Persegi p = new Persegi();
            System.out.print("Masukkan sisi: ");
            p.setSisi(input.nextDouble());

            System.out.println("Luas Persegi Adalah = " + p.LuasPersegi());
        }

        else if(pilih == 2){
            PersegiPanjang pPanjang = new PersegiPanjang();

            System.out.print("Masukkan panjang: ");
            pPanjang.setPanjang(input.nextDouble());

            System.out.print("Masukkan lebar: ");
            pPanjang.setLebar(input.nextDouble());

            System.out.println("Luas Persegi Panjang Adalah = " + pPanjang.LuasPersegiPanjang());
        }

        else if(pilih == 3){
            Segitiga sTiga = new Segitiga();

            System.out.print("Masukkan alas: ");
            sTiga.setAlas(input.nextDouble());

            System.out.print("Masukkan tinggi: ");
            sTiga.setTinggi(input.nextDouble());

            System.out.println("Luas Segitiga Adalah = " + sTiga.LuasSegitiga());
        }
    }
}
package latihan_pbo.latihan2_2407024;

public class Main {
    public static void main(String[] args) {
        coba pp1 = new coba();

        pp1.setPanjang(9);
        System.out.println("Panjangnya adalah : " + pp1.getPanjang());

        pp1.setLebar(18);
        pp1.cetakLuas();
        System.out.println("Luasnya adalah : " + pp1.hitungLuas());
    }
}
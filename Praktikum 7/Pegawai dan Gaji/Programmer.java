/*
 * File : Programmer.java  (09/05/2023)
 * Penulis : Ahmad Alvin Griffin (24060121140106)
 * Deskripsi : Kelas Programmer yang merupakan turunan dari kelas Vehicle
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+bonus);
    }
}
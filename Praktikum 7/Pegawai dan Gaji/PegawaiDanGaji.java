/*
 * File : PegawaiDanGaji.java  (09/05/2023)
 * Penulis : Ahmad Alvin Griffin (24060121140106)
 * Deskripsi : Kelas yang berisi program utama Pegawai dan gaji pegawai
 */

public class PegawaiDanGaji{
  public static void main(String args[]){
    Pegawai pegawai = new Programmer("Mira");
    Pegawai pegawai2 = new Manajer("Joko");
    Pegawai pegawai3 = new Manajer("Argo");

    Payroll payroll = new Payroll();
    payroll.cetakGaji(pegawai);
    payroll.cetakGaji(pegawai2);
    payroll.cetakGaji(pegawai3);
  }
}
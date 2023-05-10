/*
 * File : Vehicle.java  (03/05/2023)
 * Penulis : Ahmad Alvin Griffin (24060121140106)
 * Deskripsi : SuperClass dari kelas Car dan Bus
 */

public class Vehicle{
  void calRent(int distance, float price){
    float fare = distance * price;
    System.out.println("vehicle price = "+fare);
  }
}
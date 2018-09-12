/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class kasir{
    
public static String nama_barang,nama_pembeli;
public static int jumlah_barang;
public static double harga_barang, total_harga, total_bayar, diskon;

    public static void main(String[] args) {
     awal();
     diskon1();
     diskon2();
     diskon3();
             }


static void awal(){
      Scanner scan = new Scanner(System.in);
        
    
    
      System.out.println("~ Selamat Datang di Progam Toko ~");
      System.out.println();
      
      System.out.print("Nama Pembeli     : ") ;
      nama_pembeli = scan.next();
   
      System.out.print("Nama Barang     : ") ;
      nama_barang = scan.next();
        
      System.out.print("Harga Barang    : ") ;
      harga_barang = scan.nextDouble();
      
      System.out.print("Jumlah Barang   : ") ;
      jumlah_barang = scan.nextInt();
      
      total_harga = harga_barang * jumlah_barang;
      return;
}
static void diskon1(){
      if (total_harga >= 100000 && total_harga < 200000){
        diskon = total_harga * 10 / 100;
        total_harga = total_harga - diskon;
        System.out.println("Total Harga :" +total_harga);
      }
      }
static void diskon2(){
      if (total_harga >= 200000 && total_harga < 500000){
        diskon = total_harga * 20/100;
        total_harga = total_harga - diskon;
        System.out.println("Total Harga :" +total_harga);
      }
      }
static void diskon3(){
      if (total_harga >= 500000){
        diskon = total_harga * 50 / 100;
        total_harga = total_harga - diskon;
        System.out.println("Total Harga :" +total_harga);
      }
      }
}
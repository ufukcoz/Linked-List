/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package çiftyönlüdüğümdoğrusal;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ÇiftYönlüDüğümDoğrusal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
   CiftYonluListeYapisii b1=new CiftYonluListeYapisii();
   int seçim=-1,sayi = 0,index = 0;
  while(seçim!=0)   
  {
      System.out.println("1- basa ekle");
        System.out.println("2- sona ekle");
          System.out.println("3- araya ekle");
         System.out.println("4- bastan sil");
          System.out.println("5- sondan sil"); 
          System.out.println("6- aradan sil");
        System.out.println("0- cik");
  
        
      System.out.println("seciminiz: ");
      seçim=scan.nextInt();
      
      if(seçim==1){
          System.out.println("sayi : ");
          sayi=scan.nextInt();
          b1.BasaEkle(sayi);
      
      }else if(seçim==2){
          System.out.println("sayi: ");
           sayi=scan.nextInt();
           b1.SonaEkle(sayi);}
         
      else if(seçim==3){
          System.out.println("sayi : ");
          sayi=scan.nextInt();
          System.out.println("indis : ");
          index=scan.nextInt();
          b1.arayaEkle(index, sayi);
      }
      else if(seçim==4){
          b1.bastanSil();
      }
    
     else if(seçim==5){
          b1.sondanSil();
      }
     else if(seçim==6){
      System.out.println("indis : ");
          index=scan.nextInt();
          b1.aradanSil(index);
     
     }
  b1.yazdir();
    }}
    
}

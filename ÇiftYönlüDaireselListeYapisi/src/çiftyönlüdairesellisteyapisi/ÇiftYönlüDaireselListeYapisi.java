
package çiftyönlüdairesellisteyapisi;

import java.util.Scanner;


public class ÇiftYönlüDaireselListeYapisi {

    
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
BağliListe liste =new BağliListe();
int seçim =-1;
  while(seçim!=0)   
  {
      System.out.println("1- basa ekle");
        System.out.println("2- bastan sil");
          System.out.println("3- sona ekle");
         System.out.println("4- sondan sil");
          System.out.println("5- araya ekle"); 
          System.out.println("6- aradan sil");
          System.out.println("7- tersten yazdir");
        System.out.println("8- cik");
  
        
      System.out.println("seciminiz: ");
      seçim=scan.nextInt();
      
       switch (seçim){
                case 1:liste.BasaEkle();break;
                case 2:liste.BastanSil();break;
                case 3:liste.SonaEkle();break;
                case 4:liste.SondanSil();break;
                case 5:liste.ArayaEkle();break;
                case 6:liste.AradanSil();break;
                case 7:liste.TerstenYazdir();break;
                case 8:System.out.println("cikis yaptınız");;break;
                default:System.out.println("hatalı secim 0-6 arasi bir numara secin lutfen");break;
                
            }
            
     
     
  liste.yazdir();
    }}
    }
    


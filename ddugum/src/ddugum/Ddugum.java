/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ddugum;

/**
 *
 * @author hp
 */
public class Ddugum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   sinif a=new sinif();
        sinif b=new sinif();
            sinif c=new sinif();
            a.sayi=11;
            b.sayi=22;
            c.sayi=33;
             a.next=b;
             b.next=c;
             c.next=null;
             sinif temp =a;
             while(temp!=null){
                 System.out.println(temp.sayi);
                 
                 temp=temp.next;
             }
    }
    
}

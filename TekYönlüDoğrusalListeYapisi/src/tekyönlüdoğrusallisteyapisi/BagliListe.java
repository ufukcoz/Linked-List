
package tekyönlüdoğrusallisteyapisi;

import java.util.Scanner;

public class BagliListe {
  Scanner scan=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    Node temp=null;
    Node temp2=null;
    int data,indis;
    void BasaEkle(){
        
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
            head=eleman;
            tail=eleman;
            
            System.out.println("liste yapisi olustu ilk eleman eklendi");
        }
        else{
            eleman.next=head;
            head=eleman;
            System.out.println("basa eleman eklendi");
        }
    
}

   void SonaEkle(){
        
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
            head=eleman;
            tail=eleman;
            
            System.out.println("liste yapisi olustu ilk eleman eklendi");
        }
        else if(head==tail){
            eleman.next=head;
            head=eleman;
            System.out.println("basa eleman eklendi");
        }
        else{
          tail.next=eleman;
            tail=eleman;
            System.out.println("sona ekledik");
        }
   }
   void ArayaEkle(){
        System.out.println("indis : " );indis=scan.nextInt();
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
             head=eleman;
            tail=eleman;
            System.out.println("liste olustu ilk eleman eklendi");
            
        }
        else if(head!=null&&indis==0){
             eleman.next=head;
            head=eleman;
            System.out.println(indis + "indisinci siraya eleman eklendi");  
        }
        else {
            int n=0;
         
            while(temp!=null&&n<indis){
                temp2=temp;
                temp=temp.next;
                n++;
        }
        if(n==indis){
           tail.next = eleman;
           tail=eleman;
            System.out.println("sona eleman eklendi");
        }
        else{
            temp=head;
            temp2=null;
            int i=0;
            while(i!=indis){
                temp2=temp;
                temp=temp.next;
                i++;
            }
            temp2.next=eleman;
            tail=eleman;
            eleman.next=temp;
            System.out.println(indis + "indisinci siraya eleman eklendi");  
        }
        
        
        }}
   void BastanSil(){
        if(head==null){
            System.out.println("liste bos");
        }
        else if(head==tail){
            head=null;
            tail=null;
            
        }
        else{
            head=head.next;
        }}
    void SondanSil(){
        if(head==null){
            System.out.println("liste bos");
        }
        else if(head==tail){
            head=null;
            tail=null;
            
        }
        else{
            temp=head;
           temp2=null;
           while(temp.next!=null){
               temp2=temp;
               temp=temp.next;
               
           }
           temp2.next=null;
           tail=temp2;
            System.out.println("sondan eleman silindi");
        
        }}
    void AradanSil(){
         System.out.println("indis : ");indis=scan.nextInt();
        if(head==null){
            System.out.println("liste bos");
        }
        else if(head==tail&&indis==0){
           
            head=null;
            tail=null;
            System.out.println("son elemanda silindi");
        }
        else if(head!=tail&&indis==0){
            head=head.next;
            System.out.println("bastaki eleman silindi");
        
        }
        else{
             int n=0;
                    temp=head;
                    temp2=head;
                while(temp!=null){
                    temp2=temp;
                    temp=temp.next;
                    n++;
        }
                if(n==indis){
                    temp2.next=null;
                    tail=temp2;
                    System.out.println("son eleman silindi");
                }
                else{
                    temp=head;
                    temp2=head;
                    int i=0;
                    while(i!=indis){
                        temp2=temp;
                        temp=temp.next;
                        i++;
                    }
                    temp2.next=temp.next;
                    System.out.println("aradan eleman silindi");
                }
    }}
        

       void yazdir(){
        if(head==null){
            System.out.println("liste bos");
        }
        else{
             temp=head;
            System.out.print("Bas ->");
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("son");
        }


}}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tekyonludairesellisteyapisi;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class BagliListe {
    Scanner scan=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    void BasaEkle(){
        int data;
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
        }else{
            eleman.next=head;
            head=eleman;
            tail.next=head;
        }
    }
    void SonaEkle(){
         int data;
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
        }else{
            tail.next=eleman;
            tail=eleman;
            tail.next=head;
        }
    }
    void ArayaEkle(){
        int data,indis;
        System.out.println("indis : ");
        indis=scan.nextInt();
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;}
        else if(head!=null&&indis==0){
            eleman.next=head;
            head=eleman;
            tail.next=head;
        }
        else{
            int n=0;
            Node temp=head;
            Node temp2=head;
            while(temp!=tail){
                temp=temp.next;
                n++;
            }
            n++; //tailide saymak için
            if(indis>=n){
            tail.next=eleman;
            tail=eleman;
            tail.next=head;
            }
            else {
                temp=head;
                temp2=temp;
                int i=0;
                while(i<indis){
                    i++;
                    temp2=temp;
                    temp=temp.next;
                }
                temp2.next=eleman;
                eleman.next=temp;
            }
        }
    
    
    
    }
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
            tail.next=head;
            
        }
    }
    void SondanSil(){
        if(head==null){
            System.out.println("liste bos");
        }
        else if(head==tail){
            head=null;
            tail=null;
            
        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
                tail=temp;
                tail.next=head;
                
            
        }
    }
        void AradanSil(){
            if(head==null){
            System.out.println("liste bos");
        }
        else if(head==tail){
            head=null;
            tail=null;
            
        }
        else{
            int indis,n=0;
                System.out.println("indis : ");
                indis=scan.nextInt();
                Node temp=head;
                Node temp2=temp;
                while(temp!=tail){
                    temp=temp.next;
                    n++;
               }
                n++;
                temp=head;
                int i=0;
                while(i<indis){
                    temp2=temp;
                    temp=temp.next;
                    i++;
                }
                temp2.next=temp.next;
        }
        }    
       
    
    void yazdir(){
        if(head==null){
            System.out.println("liste bos");
        }
        else{
            Node temp=head;
            System.out.print("Bas ->");
            while(temp!=tail){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println(temp.data + " son");
        }
    }
    
}

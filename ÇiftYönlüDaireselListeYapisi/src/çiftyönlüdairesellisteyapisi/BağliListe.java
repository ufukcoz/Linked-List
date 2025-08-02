
package çiftyönlüdairesellisteyapisi;

import java.util.Scanner;


public class BağliListe {
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
            head.next=tail;
            tail.prev=head;
            tail.next=head;
            head.prev=tail;
           
        }else{
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
            tail.next=head;
            head.prev=tail;
        }
    }
    void SonaEkle(){
        
        System.out.println("data : ");
        data=scan.nextInt();
        Node eleman=new Node(data);
        if (head==null){
            head=eleman;
            tail=eleman;
            head.next=tail;
            tail.prev=head;
            tail.next=head;
            head.prev=tail;
        }else{
       tail.next=eleman;
       eleman.prev=tail;
       tail=eleman;
       head.prev=tail;
       tail.next=head;
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
            head.next=tail;
            tail.prev=head;
            tail.next=head;
            head.prev=tail;
        }else if(indis==0){
             eleman.next=head;
            head.prev=eleman;
            head=eleman;
            tail.next=head;
            head.prev=tail;
        }
        else{
             int n=0;
           temp=head;
           temp2=temp;
            while(temp!=tail){
                temp=temp.next;
                n++;
            }
            temp=head;
            int i=0;
            while(i<indis){
                temp2=temp;
                temp=temp.next;
                i++;
            }
            if(n<indis){
        tail.next=eleman;
       eleman.prev=tail;
       tail=eleman;
       head.prev=tail;
       tail.next=head; 
            }
            else{
                temp2.next=eleman;
                eleman.prev=temp2;
                eleman.next=temp;
                temp.prev=eleman;
            }
        }
    }
     void yazdir(){
        if(head==null){
            System.out.println("liste bos");
        }
        else{
             temp=head;
            System.out.print("Bas ->");
            while(temp!=tail){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println(temp.data + " son");
        }
    }
     void TerstenYazdir(){
         if(head==null){
            System.out.println("liste bos");
        }
        else{
            temp=tail;
            System.out.print("son ->");
            while(temp!=head){
                System.out.print(temp.data+" -> ");
                temp=temp.prev;
            }
            System.out.println(temp.data + " ilk");
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
            head.prev=tail;
            
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
             temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
                tail=temp;
                tail.next=head;
                head.prev=tail;
                
            
        }}
    void AradanSil(){
            if(head==null){
            System.out.println("liste bos");
        }
       
        else{
                System.out.println("indis : ");
                indis=scan.nextInt();
                if(indis==0&&head==tail){
                    head=null;
                    tail=null;
                }
                else if(indis==0&&head!=tail){
                   head=head.next;
                   head.prev=tail;
                   tail.next=head.next;
                }
                else{
                    int n=0;
                    temp=head;
                Node temp2=temp;
                while(temp!=tail){
                    temp=temp.next;
                    n++;
               }
                n++;
                
                if(indis>=n){
                 tail=temp;
                tail.next=head;
                head.prev=tail;
                }
                else{
                    temp=head;
                    temp2=temp;
                    int i=0;
                    while(i<indis){
                        i++;
                        temp2=temp;
                        temp=temp.next;
                    }
                    temp2.next=temp.next;
                    temp.next.prev=temp2;
                }
               
               }}
                
              
        
        }    
       
    
}

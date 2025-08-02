/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çiftyönlüdüğümdoğrusal;

/**
 *
 * @author hp
 */
public class CiftYonluListeYapisii {
   Node head=null;
    Node tail=null;
    void BasaEkle(int data){
        Node eleman =new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;}
        
        else{
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
        }
    }
    void SonaEkle(int data){
         Node eleman =new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;}
        else{
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
        }
    } 
    void arayaEkle(int indis, int data){
       Node eleman =new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;}
        else if(head!=null&&indis==0){
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
        }else{
            int n=0;
            Node temp= head;
            while(temp!=null){
                temp=temp.next;
                n++;}
                temp=head;
                
                if(indis>n){
              tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
                }
                else{
                    int i=0;
                    while( i!=indis){
                        temp=temp.next;
                        i++;
                    }
                    eleman.prev=temp.prev;
                    temp.prev.next=eleman;
                    eleman.next=temp;
                    temp.prev=eleman;
                    
                }
            }
        }
    void bastanSil(){
        if(head!=null){
            if(head.next==null){
            head=null;
            tail=null;
            
        }
        else{
            head=head.next;
            head.prev=null;
            
        }
    }}
         void sondanSil(){
            if(head!=null){
            if(head.next==null){
            head=null;
            tail=null;
            
        }
            else{
                tail=tail.prev;
                tail.next=null;
            }
         }}
    void aradanSil(int indis){
        if(head!=null){
            if(head.next==null&&indis==0){
            head=null;
            tail=null;
            
        }
          else if(head.next!=null&&indis==0){
            head=head.next;
            head.prev=null;
            
        } else{
            
        int n=0;
            Node temp= head;
            while(temp!=null){
                temp=temp.next;
                n++;}
            if(indis>=n-1){
                tail=tail.prev;
                tail.next=null;
                
            }
            else{
                temp=head;
                int i=0;
                while(i<indis){
                    i++;
                    temp=temp.next;
                }
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;
            }
        }
        }    
   }
    
 
    void yazdir (){
        Node temp=head;
        System.out.print("bas -> ");
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        } System.out.println("son.");
    }
}

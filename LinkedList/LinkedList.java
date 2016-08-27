/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Ashmita
 */
public class LinkedList {
    Node head;
    
    public LinkedList()  // initialise head node, constructor
    {
        head = null;
    }
    
   public void insertAtBeg(int d)
   { 
        Node newnode = new Node(d);
        newnode.next = head;
        head = newnode;
       
   }
   
   public void insertAtEnd(int d)
   {
       Node newnode = new Node(d);
       Node move;
       move = head;
       while(move.next != null)
       {
           move = move.next;
       }
       move.next = newnode;
       newnode.next = null;
       
   }
   
   public void delete(int d)
   {
       Node move;
       move = head;
       if(move == null)
           System.out.println("Empty List");
       else 
       {
          if (move.data == d)    //if data found in first node
              head = move.next;
          else
          {   
              while(move.next.data != d)
             {
                move = move.next;
             }
             if(move.next.next == null)   //if data found in last node
                 move.next = null;
             else
                 move.next = move.next.next;  //if data found in between node
          }
       }
                    
   }
   
   public void display()
   {
       Node move;
       move = head;
       if(move == null)
       {
           System.out.print("LinkedList is empty");
       }
       else
       {
           while(move!=null)
           {
               System.out.print(move.data + " ");
               move=move.next;
           }
       }
   }

   
}

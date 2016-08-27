
package practice;

import java.util.EmptyStackException;


public class Stack<T> {
    Node<T> top;
    public Stack()  // initialise head node, constructor
    {
        top = null;
    }
    
   public void push(T d)
   { 
        Node<T> newnode = new Node<T>(d);
        newnode.next = top;
        top = newnode;
       
   }
  
   
   public void pop()
   {
       T item;
       if(top == null)
         throw new EmptyStackException();
       else
       {
          item = top.data;
          top = top.next;
       }
       System.out.println("Popped element is : " + item);
   }
   
   public void peek()
   {
      if(top == null)
          System.out.println("empty");
      else
          System.out.println("Top element is :" + top.data);
   }
   
   public boolean isEmpty()
   {
       return top == null;
   }

   

      
 }
          

       
       


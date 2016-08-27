package practice;

import java.util.Scanner;


public class LinkedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    LinkedList list = new LinkedList();
    //Insert element
    Scanner s = new Scanner(System.in);
    int d;
    System.out.println("Enter 4 integers to add in beg in a line");
    for(int i = 0; i < 4 ; i++)
    {
        d = s.nextInt();
        list.insertAtBeg(d);
    }
    System.out.println("\nNow list is : ");
    list.display();
    
    System.out.println("\nEnter number to delete");
    d = s.nextInt();
    list.delete(d);
    System.out.println("\nNow list is : ");
    list.display();
    
    System.out.println("\nEnter 2 numbers to add at the end of list");
    for(int i = 0; i < 2 ; i++)
    {
        d = s.nextInt();
        list.insertAtEnd(d);
    }
    System.out.println("\nNow list is : ");
    list.display();
    }
      
    }
    


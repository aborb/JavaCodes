/*
 * One Away : There are three types of edits that can be performed on strings : insert a character, 
 * remove a character or replace a character. Given two strings check if they are one edit away (or zero edit).
 * Example: pale, ple - true | pales, pale - true | pale, bale - true | pale, bake - false.
 */


import static java.lang.Math.min;
import java.util.Scanner;


public class OneAway {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter strings");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        boolean t = checkEdit(s1,s2);
        System.out.println(t);
    }
    
    public static boolean checkEdit(String s1, String s2)
    {
        int count=0, i=0;
//        Precheck
        if(s1.equals(s2))
            return true;
        else if(s1.length()-s2.length()>1 || s2.length()-s1.length()>1 )  //if difference in length is greater than 1, false
            return false;
			
        for(int j=0; j < min(s1.length(),s2.length()); j++)
        {
            
            if(s1.charAt(j)==s2.charAt(i))
           {
               i++;
           }
           else
           {
               if(s1.length()>s2.length())
               { 
                   count++;
               }
               else
                   
               {   
                   i++;
                   count++;
               }
                   
           }
           
    }
           
        if(count>1)
            return false;
        else 
            return true;
}
}

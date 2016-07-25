/*
 *Given a String, write a function to check if it is a permutation of a palindrome.
 * ex - Input -> Tact Coa.. Output -> True (taco cat, atco cta etc.)
 * LOGIC - String is palindrome if all letters, except one (atmost) are paired.
 * If more than one  letter unpaired, implies not a palindrome
 */

import java.util.HashMap;
import java.util.Scanner;


public class PermutationPalindrome {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scan.nextLine();
        s= s.toLowerCase();					//ignoring case
        boolean t= checkPermutation(s);
        System.out.println(t);
    }
    
    public static boolean checkPermutation(String s)
    {
        HashMap<Character,Integer> h = new HashMap<>();
        int count=1; char m; int flag=0;
        for(char c : s.toCharArray())
        {
            if(h.containsKey(c)==true)
            {
                count=h.get(c);
                h.put(c,count+1);
            }

            else
                h.put(c,1);
        }
        for(int i = 0; i < s.length(); i++)
        {
            m = s.charAt(i);
            if(m==' ')               // to account for spaces in string
                continue;
            count=h.get(m);
            if(count==1)
            {
                flag++;
                if(flag > 1)
                    return false;
            }
            
            
        }
        return true;
        
    }
   
}

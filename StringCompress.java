

import java.util.Scanner;

public class StringCompress {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = scan.nextLine();
        System.out.println(compressString(s1));
    }
    
    public static String compressString(String s1)
    {
        StringBuilder output = new StringBuilder();
        int count=1; char last=s1.charAt(0);
        for(int i=1; i < s1.length(); i++)
        {
            if(s1.charAt(i)==last)
                count++;
            else
            {
                output.append(last);
                output.append(count);
                count=1;
            }
            
            last=s1.charAt(i);
                       
        }
            
         output.append(last);              //for appending last character/characters
         output.append(count);
            
        if(output.length()>=s1.length())  //if compressed string is not smaller, return original
            return s1;
        else
            return (output.toString());

         
    }
        
}


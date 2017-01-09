import java.io.*;

public class ReverseWords {
    public static void main(String args[] ) throws Exception {
       
        FileInputStream fis = new FileInputStream("B-large-practice.in");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String N = br.readLine();
        String line = null;
        int caseNo = 1;
        while((line = br.readLine()) != null )
        {
            String words[] = line.split(" ");
            System.out.print("Case #"+caseNo+": ");
            for(int i = words.length-1 ; i > 0; i--)
            {
              System.out.print(words[i] + " ");
            }
              System.out.print(words[0]);

           caseNo++;
            System.out.println();
        }
}
    
}

 */
package contests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


class Contests {
    public static void main(String args[]) throws IOException {
        
        Scan scan = new Scan();
        Print print = new Print();
        int n = scan.scanInt();             
        
        
    for (int j = 0; j < n ; j ++)
    {
        int credit = scan.scanInt();
        int items = scan.scanInt();
        int[] price = new int[items];
        Map<Integer, Integer> set = new HashMap<>();

        for(int i = 0; i < items ; i++)
        {
            price[i] = scan.scanInt();
            set.put(price[i],i);
        }
            
        for(int i = 0; i < items ; i++)
        {
            int diff = credit - price[i];
            if(set.containsKey(diff) && set.get(diff) != i)
            {
              int key = (set.get(diff));
              System.out.println("Case #" + (j+1) +": " + (i+1) + " " + (key+1));
              break;
           
            }
            
        }
    }
    }
}
    
// Brian Kernigham Algo for counting number of SET bits in a number's binary representation 
 
 public int numberOfBits(int num){
       
       int count = 0;
       while(num !=0){
           num = num & (num-1);
           count++;
       }
       return count;
   }
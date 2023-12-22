import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      long k = sc.nextLong();
      long ans = 0;
      long curSum = getSum(k);
      long multiplier = 2;
      while(true){
         long next = k * multiplier;
         long nextSum = getSum(next);
         if(nextSum >= curSum) {
            System.out.println(curSum);
            System.exit(0);
         }
         curSum = nextSum;
         multiplier++;
      }
   }
   
   public static long getSum(long k){
      if(k / 10 == 0)
         return k;
      return k % 10 + getSum(k/10);
   }
}
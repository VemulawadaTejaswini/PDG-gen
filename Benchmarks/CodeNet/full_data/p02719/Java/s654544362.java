import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      long n = sc.nextLong();
      long k = sc.nextLong();
      
      long min = n;
      long prevn = n;
      
      for (int i = 0; i < 1000000000; i++) {
         if (prevn > k) {
            prevn = prevn - k;
         } else if (prevn < k) {
            prevn = k - prevn;
         } else {
            prevn = 0;
         }
         if (min > prevn) {
            min = prevn;
         } else if (min == 0) {
            break;
         }
      }
      
      System.out.println(min);
      
   }   
}

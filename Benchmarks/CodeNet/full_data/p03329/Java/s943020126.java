import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double n = sc.nextInt();

      int x = 0;

      double s = 0;
      double t = 0;

   while(n > 0) {

      for (int i = 1; i <7; i++) {
         if (n - Math.pow(6,i) <= 0) {
            s = Math.pow(6,i-1);
            break;
         }
      }
      for (int i = 1; i <7; i++) {
         if (n - Math.pow(9,i) <= 0) {
            t = Math.pow(9,i-1);
            break;
         }
      }

      if (s <= t) {
         n = n - t;
      }
      else {
         n = n - s;
      }
      x = x + 1;  
   }
      System.out.println(x);
   }
}
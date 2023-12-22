import java.util.*;
public class Main {
 
   static boolean isHarshad(int n) {
      
      Scanner scanner = new Scanner(System.in);
      int c = scanner.nextInt;
      
      int sum = 0;
      int d = 0;
      
      while (c > 0) {
         d = c % 10;
         sum = sum + d;
         c = c / 10;
      }
      return (n % sum == 0);
   }
 
   public static void main(String[] args) {
 
      int count = 0;
      int number = 1;
      while (count != 50) {
         if (isHarshad(number)) {
            System.out.println(number);
            count++;
         }
         number++;
      }
   }
}

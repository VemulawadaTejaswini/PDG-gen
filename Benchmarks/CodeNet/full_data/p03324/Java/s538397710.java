import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int d = sc.nextInt();
      int n = sc.nextInt();

      int i = 0;

      int j = 1;

      while ( i < d ) {
         j = j * 100;
         i = i + 1;
      }

      System.out.println(n * j);

   }
}
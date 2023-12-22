import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int h = 0;

      for (int i = 0; i < b - a; i++) {
         h = h + i;
      }

      h = h - a;

      System.out.println(h);
   }
}
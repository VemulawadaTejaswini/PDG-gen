import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int[] x = new int[n];
      for (int i = 0; i < x.length; i++) {
         x[i] = sc.nextInt();
      }

      int c = 0;
      int d = 2;

  outer:
   for (int j = 0; j < 10000000; j++) {

      int[] y;
      y = new int[n];

     try {


      for (int i = 0; i < x.length; i++) {
         y[i] = x[i] % d;
      }

     } catch (ArithmeticException e) { 
            System.out.println("0で除算はできません。");
        }


      for (int i = 0; i < x.length; i++) {
         int  a = y[i] ;
         if (a == 1) {
            break outer;
         }
      }
      c = c + 1;
      d = d * 2;
   }

      System.out.println(c);

   }
}
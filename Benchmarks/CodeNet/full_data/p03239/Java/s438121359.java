import java.util.*;
public class Main {
   static Scanner sc = new Scanner(System.in);
   static Scanner sc2 = new Scanner(System.in);
   public static void main(String[] args) {
      int N = sc.nextInt();
      int T = sc.nextInt();
      int[] c = new int[N];
      int[] t = new int[N];
      int min = 10000;

      for (int i = 0; i < N; i++) {
         c[i] = sc.nextInt();
         t[i] = sc.nextInt();
      }

      for (int i = 0; i < N; i++) {
         if (T >= t[i]) {
            min = min > c[i] ? c[i] : min;
         }
      }

      if (min == 10000) {
         System.out.println("TLE");
      } else {
         System.out.println(min);
      }
   }

}
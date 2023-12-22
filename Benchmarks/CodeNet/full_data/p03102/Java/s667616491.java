import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int M = sc.nextInt();
      int c = sc.nextInt();

      int[] b = new int[M];
      for (int i = 0; i < b.length; i++) {
         b[i] = sc.nextInt();
      }

      int count = 0;

      for(int j = 0; j < N; j++){

         int sum = 0;

         int[] a = new int[M];
         for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
         }

         for(int i = 0; i < M; i++){
            sum = sum + a[i] *  b[i];
         }

         sum = sum + c;
  
         if (sum > 0) {
            count = count + 1;
         }
      }

      System.out.println(count);


   }
}
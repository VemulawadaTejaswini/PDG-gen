import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] a = new int[n];
      int[] b = new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
         b[i] = sc.nextInt();
      }

      long cost = 0;
      int sum = 0;

      mergeSort(a, b); 

      outer:
         for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < b[j]; i++){
               cost = cost + a[j];
               sum = sum + 1;
               if (sum > m) {
                  cost = cost - a[j];
                  break outer;
               }
            }
         }

      System.out.println(cost);

   }

   public static void merge(int[] a1, int[] a2, int[] a, int[] b1, int[] b2, int[] b) {
      int i = 0;
      int j = 0;
      while (i < a1.length || j < a2.length) {
         if (j >= a2.length || (i < a1.length && a1[i] < a2[j])) {
            a[i + j] = a1[i];
            b[i + j] = b1[i];
            i++;
         } else {
            a[i + j] = a2[j];
            b[i + j] = b2[j];
            j++;
         }
      }
   }

   public static void mergeSort(int[] a, int[] b) {
      if (a.length > 1) {
         int m = a.length / 2;
         int n = a.length - m;
         int[] a1 = new int[m];
         int[] a2 = new int[n];
         int[] b1 = new int[m];
         int[] b2 = new int[n];
         for (int i = 0; i < m; i++) {
            a1[i] = a[i];
            b1[i] = b[i];
         }
         for (int i = 0; i < n; i++) {
            a2[i] = a[m + i];
            b2[i] = b[m + i];
         }
         mergeSort(a1, b1);
         mergeSort(a2, b2);
         merge(a1, a2, a, b1, b2, b);
      }
   }

}

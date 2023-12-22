import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] aset = new int[n];
      int i,j;
      double limit = Math.pow(10, 9);
      int ans = 0;
      int count = 0;
      double cost = 0;
      for (i = 0; i < n; i++) {
         aset[i] = sc.nextInt();
      }
      sort(aset);
      int second = aset[1];
      for (i=second; i>0; i--) {
         for (j=0; j<n; j++) {
            if ((aset[j]%i) == 0) {
               count++;
            }
         }
         if (count == (n-1)) {
            ans = i;
            break;
         } else {
            count = 0;
            continue;
         }
      }
      System.out.println(ans);
   }
   static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
             }
   }
}
}

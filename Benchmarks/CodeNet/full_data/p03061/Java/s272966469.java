import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] aset = new int[n];
      int i,j;
      double limit = Math.pow(10, 9);
      int sum = 0;
      int Flag = 0;
      double cost = 0;
      for (i = 0; i < n; i++) {
         aset[i] = sc.nextInt();
      }
      for (i=1; i<limit; i++) {
         for (j=0; j<n; j++) {
            if ((aset[i] % i) == 0) {
               continue;
            } else {
               Flag = 1;
               break;
            }
         }
         if (Flag == 1) {
            cost = i;
            break;
         }
      }
      if (Flag == 0) {
         cost = limit;
      }
      System.out.println(cost);
   }
}

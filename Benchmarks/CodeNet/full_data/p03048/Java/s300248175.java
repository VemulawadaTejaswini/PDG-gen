import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0, z=0, n=0;
      int sum = 0;
      int nokori;
      int r, g, b;
      int i,j,k;
      int count=0;
      int tempj, tempk;
      try {
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
         y = scanner.nextInt();
         z = scanner.nextInt();
         n = scanner.nextInt();
         scanner.close();
      } catch (InputMismatchException e) {
         System.out.println("error");
      }
      r = n/x;
      g = n/y;
      b = n/z;
      for (i=0; i<r+1; i++) {
         sum = x*i;
         //nokori = n-sum;
         tempj = sum;
         for (j=0; j<g+1; j++) {
            sum = sum + j*y;
            if (sum>n) {
               sum = tempj;
               continue;
            }
            tempk = sum;
            for (k=0; k<b+1; k++) {
               sum = sum + k*z;
               if (sum == n) {
                  count++;
                  //System.out.println(i + "," + j + "," + k);
               }
               sum = tempk;
            }
            sum = tempj;
         }
         sum = 0;
      }
      System.out.println(count);
   }
}

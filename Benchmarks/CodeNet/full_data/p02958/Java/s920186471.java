import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int N=0;
      int[] p;
      Scanner scanner = new Scanner(System.in);
      N = scanner.nextInt();
      p = new int[N];
      for (int i=0; i<N; i++) {
         p[i] = scanner.nextInt();
      }
      scanner.close();
      int flag = 0;
      for (int k = 0; k<N-1; k++) {
         for (int i=k+1; i<N; i++) {
            if (p[i] < p[k]) {
               flag = 1;
               break;
            }
         }
      }
      if (flag == 0) {
         System.out.println("YES");
      } else {
         int flag2 = 0;
         int flag3 = 0;
         for (int i= 0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {

               int tmp = p[i];
               p[i] = p[j];
               p[j] = tmp;
               for (int k = 0; k<N-1; k++) {
                  for (int l=k+1; l<N; l++) {
                     if (p[l] < p[k]) {
                        flag2 = 1;
                        break;
                     }
                  }
               }
               // for (int k = 0; k<N; k++) {
               //    System.out.println(p[k]);
               // }
               // System.out.println();
               if (flag2 == 0) {
                  System.out.println("YES");
                  flag3 = 1;
                  break;
               }
               p[j] = p[i];
               p[i] = tmp;
               flag2 = 0;
            }
            if (flag3 == 1) {
               break;
            }
         }

         if (flag3 == 0) {
            System.out.println("NO");
         }

      }

   }
}

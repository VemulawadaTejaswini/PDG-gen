import java.util.Scanner;
import java.util.InputMismatchException;


class Main {
   public static void main(String args[]) {
      int N=0 ,K=0;
      double sum = 0;
      Scanner scanner = new Scanner(System.in);
      N = scanner.nextInt();
      K = scanner.nextInt();
      scanner.close();
      int x;
      int y;
      for (int i=1; i<N+1; i++) {
         if (i>=K) {
            sum = sum+1/(double)N;
         } else {
            x = (int)((double)K / (double)i);
            y = (int)(Math.log(x)/Math.log(2)) +1;
            sum = sum + (1/(double)N)*Math.pow((double)0.5, (double)y);
         }
      }
      System.out.println(sum);
   }
}

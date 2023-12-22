import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      scanner.close();
      if ((x+y)%2 == 0) {
         int k1 = (x+y)/2;
         System.out.println(k1);
      }else if (x == y) {
         int k2 = x;
         System.out.println(k2);
      }else {
         System.out.println("IMPOSSIBLE");
      }

   }
}

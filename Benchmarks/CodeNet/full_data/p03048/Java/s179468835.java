import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int r = Integer.parseInt(sc.next()), g = Integer.parseInt(sc.next()), b = Integer.parseInt(sc.next());

       int n = Integer.parseInt(sc.next());

       int combinations = 0;

       for (int i = 0; i <= 3000 / r; i++) {

           for (int j = 0; j <= 3000 / g; j++) {

               for (int k = 0; k <= 3000 / b; k++) {

                   if (i * r + j * g + k * b == n) {
                       combinations++;
                   }
               }
           }
       }

       System.out.println(combinations);
   }
}


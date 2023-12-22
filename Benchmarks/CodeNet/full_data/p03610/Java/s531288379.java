mport java.util.Scanner;

/**
 *
 * @author C0117306
 */
public class Main {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
         for (int i = 0; i < s.length(); i++) {
             if (i%2==0) {
                 System.out.print(s.subSequence(i, i+1));
             }
         }
         System.out.println();
    }
}

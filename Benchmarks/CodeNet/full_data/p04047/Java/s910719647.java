import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
         int n = sc.nextInt();
         int[] a = new int[n*2];
         for (int i = 0 ; i < n*2; i++) {
             a[i] = sc.nextInt();
         }
         
         
         Arrays.sort(a);
         int sum = 0;
         for (int i = 0; i < n*2; i += 2) {
             sum += a[i];
         }
         so.println(sum);
    }
}

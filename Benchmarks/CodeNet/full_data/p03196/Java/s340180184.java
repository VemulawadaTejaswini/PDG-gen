
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        final long N = sc.nextLong();
        final long P = sc.nextLong();
        if (N == 1) {
            so.println(P);
            return;
        }
        int[] primeCount = new int[(int) 1E6 + 1];
        
        long prod = P;
        for (int i = 2; i <= Math.sqrt(P); i++) {
            while (true) {
                if (prod % i == 0) {
                    prod /= i;
                    primeCount[i]++;
                } else {
                    break;
                }
            }
        }
        
        long ans = 1;
        for (int i = 2; i < 1E6 + 1; i++) {
            if (primeCount[i]/N > 0) {
                ans *= Math.pow(i,(primeCount[i]/N));
            }
        }
        so.println(ans);
    }
}

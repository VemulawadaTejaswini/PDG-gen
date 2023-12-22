import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        for(int i = 1; i <= Q; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long C = (long)Math.sqrt(A*B);
            if (C * (C+1) < A*B) {
                System.out.println(2*C - 1);
            }
            else if ( A*B == C*C && A!=B) {
                System.out.println(2*C - 3);
            }
            else {
                System.out.println(2*C - 2);
            }
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long ANS[] = new long[3];
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        ANS[0] = C + B;
        ANS[1] = C + A;
        ANS[2] = B + A;
        if (K % 2 == 0) {
            if (A - B > 10e+18) {
                System.out.println("Unfair");
                return;
            }
            System.out.println(A - B);
        } else {
            if (ANS[0] - ANS[1] > 10e+18) {
                System.out.println("Unfair");
                return;
            }
            System.out.println(ANS[0] - ANS[1]);
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] leftGcd = new int[N];
        int[] rightGcd = new int[N];

        leftGcd[0] = A[0];
        leftGcd[1] = A[0];
        for (int i = 2; i < N; i++) {
            leftGcd[i] = calcGcd(leftGcd[i - 2], A[i - 1]);
        }
        rightGcd[N - 1] = A[N - 1];
        rightGcd[N - 2] = A[N - 1];
        for (int i = N - 3; i >= 0; i--) {
            rightGcd[i] = calcGcd(rightGcd[i + 2], A[i + 1]);
        }

        int maxGcd = 1;
        for (int i = 0; i < N; i++) {
            int gcd;
            if (i == 0) {
                gcd = rightGcd[0];
            }
            else if (i == (N - 1)) {
                gcd = leftGcd[N - 1];
            }
            else {
                gcd = calcGcd(leftGcd[i], rightGcd[i]);
            }
            maxGcd = Math.max(maxGcd, gcd);
        }
        System.out.print(maxGcd);

    }
    // 最大公約数を求める。
    int calcGcd(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Arguments must be 1 and over.");
        }
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int remainder = 0;
        while ((remainder = m % n) != 0) {
            m = n;
            n = remainder;
        }
        return n;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
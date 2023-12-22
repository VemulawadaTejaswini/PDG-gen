import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        long c = 1;
        for (int i = 2; i <= n; i++) {
            int m = i;
            for (int j = 2; j <= i; j++) {
                while (m % j == 0) {
                    m /= j;
                    a[j]++;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            c = c * (a[i] + 1) % 1000000007;
        }
        System.out.println(c);
    }
}
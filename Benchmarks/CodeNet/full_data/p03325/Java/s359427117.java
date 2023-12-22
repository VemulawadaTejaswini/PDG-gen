import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        long ans = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            while (true) {
                if (a[i] % 2 != 0) {
                    break;
                } else {
                    a[i] = a[i] / 2;
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
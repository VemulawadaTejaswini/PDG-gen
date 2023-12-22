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
        long A = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            A += a[i] - 1;
        }
        System.out.println(A);
    }
}
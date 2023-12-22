import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        
        long ans = Long.MAX_VALUE;
        long red = 0;
        for (int i = 1; i < N; i++) {
            long sunuke = sum - a[N - i] - red;
            red += a[N- i];
            long arai = sum - sunuke;
            ans = Math.min(ans, Math.abs(sunuke - arai));
        }
        
        System.out.println(ans);
    }
}

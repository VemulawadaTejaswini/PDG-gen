import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        if (A[N-1] < K) {
            System.out.println("IMPOSSIBLE");
            return;
        }
        int gcd = gcd(A);
        if (K % gcd == 0) {
            System.out.println("POSSIBLE");
            return;
        }
        System.out.println("IMPOSSIBLE");
    }
    private int gcd(int[] x) {
        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            ans = gcd(x[i], ans);
        }
        return ans;
    }
    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}

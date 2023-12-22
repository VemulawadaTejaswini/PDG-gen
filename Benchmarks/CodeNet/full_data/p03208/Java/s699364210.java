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
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = scan.nextLong();
        }
        Arrays.sort(h);
        long answer = Long.MAX_VALUE;
        for (int i = 0; i <= N - K; i++) {
            answer = Math.min(answer, h[i+K-1]-h[i]);
        }
        System.out.println(answer);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long K = scan.nextLong();
        long answer = 0;
        if (K == 0) {
            System.out.println(N * N);
            return;
        }
        for (int b = 1; b <= N; b++) {
            if (b <= K) {
                continue;
            }
            long remain = N % b;
            if (K - 1 <= remain) {
                answer += remain - (K - 1);
            }
            answer += (N / b) * (b - 1 - (K - 1));
        }
        System.out.println(answer);
    }
}

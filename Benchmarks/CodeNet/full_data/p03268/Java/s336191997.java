import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] m = new int[K];
        long answer = 0;
        for (int i = 1; i <= N; i++) {
            m[i % K] += 1;
        }
        for (int a = 0; a < K; a++) {
            int b = (K - a) % K;
            int c = (K - a) % K;
            if ((b + c) % K != 0) {
                continue;
            }
            answer += (long) m[a] * m[b] * m[c];
        }
        System.out.println(answer);
    }
}

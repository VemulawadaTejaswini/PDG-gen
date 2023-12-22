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
        long X = scan.nextLong();
        // level 0 P
        // level 1 BPPPB
        // level 2 BBPPPBPBPPPBB
        long answer = count_pan(N, X);
        System.out.println(answer);
    }
    private long pan(int N) {
        long pan = 1;
        for (int i = 1; i <= N; i++) {
            pan = pan * 2 + 1;
        }
        return pan;
    }
    private long len(int N) {
        long len = 1;
        for (int i = 1; i <= N; i++) {
            len = len * 2 + 3;
        }
        return len;
    }
    private long count_pan(int N, long K) {
        if (N == 0) {
            return 1;
        }
        if (K == 1) {
            return 0;
        }
        long len = len(N);
        if (K == len) {
            return pan(N);
        }
        if (K == len/2 + 1) {
            return pan(N-1) + 1;
        }
        if (len/2 + 1 < K) {
            return pan(N-1) + count_pan(N-1, K - len/2 - 1) + 1;
        }
        return count_pan(N-1, K - 1);
    }
}

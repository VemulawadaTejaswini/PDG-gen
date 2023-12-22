import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        if (N == K) {
            System.out.println(0);
        } else if (N > K) {
            if (N % K == 0) {
                System.out.println(0);
            } else {
                N -= K * (N / K);
                solve(N, K);
            }
        } else {
            solve(N, K);
        }
    }

    private static void solve(long N, long K) {
        long comp = K - N;
        System.out.println(Math.min(comp, N));
    }
}

// x * 3 <= 16
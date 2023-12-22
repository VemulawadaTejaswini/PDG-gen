import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] A = new long[(int) N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        sc.close();

        long max = 0;
        for (int i = 0; i <= K; i++) {
            long ans = 0;
            for (int j = 0; j < N; j++) {
                ans += i ^ A[j];
            }
            if (max < ans) max = ans;
        }
        System.out.println(max);
    }
}
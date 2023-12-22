import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int N;
    private static int K;
    private static int[] h;

    static {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        K = Integer.parseInt(sc.next());
        h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        Arrays.sort(h);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= N - K; i++) {
            res = Math.min(res, h[K + i - 1] - h[i]);
        }

        System.out.println(res);
    }
}

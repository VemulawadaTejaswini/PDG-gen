import java.util.Scanner;

public class Main {
    static int N;
    static int K;
    static int[] x;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        x = new int[N];
        for(int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        int ans = 1000000;
        for(int i = 0; i < N - K + 1; i++) {
            int left = Math.abs(x[i]) + Math.abs(x[i + K - 1] - x[i]);
            int right = Math.abs((x[i + K - 1])) + Math.abs(x[i + K - 1] - x[i]);
            int cur = Math.min(left, right);
            ans = Math.min(ans, cur);
        }
        System.out.println(ans);

    }
}
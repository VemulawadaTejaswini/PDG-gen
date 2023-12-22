import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] D = new int[K];
            for (int i = 0; i < K; i++) {
                D[i] = in.nextInt();
            }

            for (int n = N;; n++) {
                if (isLike(n, D)) {
                    System.out.println(n);
                    return;
                }
            }
        }
    }

    private static boolean isLike(int n, int[] D) {
        for (; n > 0; n /= 10) {
            int mod = n % 10;
            for (int d : D) {
                if (mod == d) {
                    return false;
                }
            }
        }
        return true;
    }
}

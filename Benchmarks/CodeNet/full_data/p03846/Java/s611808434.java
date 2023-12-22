import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static final double MOD = Math.pow(10, 9) + 7;

    private static void solve(Scanner in) {
        int N = in.nextInt();
        boolean isNEven = N % 2 == 0;
        int[] count = new int[N];
        for (int i = 0; i < N; i++) {
            int A = in.nextInt();
            boolean isAEven = A % 2 == 0;
            if (isNEven && isAEven || //
                    !isNEven && !isAEven) {
                System.out.println(0);
                return;
            }
            count[A]++;
        }
        if (isNEven) {
            for (int i = 1; i < N; i += 2) {
                if (count[i] != 2) {
                    System.out.println(0);
                    return;
                }
            }
        } else {
            if (count[0] != 1) {
                System.out.println(0);
                return;
            }
            for (int i = 2; i < N; i += 2) {
                if (count[i] != 2) {
                    System.out.println(0);
                    return;
                }
            }
        }
        long ans = (long) (Math.pow(2, N / 2) % MOD);
        System.out.println(ans);
    }
}
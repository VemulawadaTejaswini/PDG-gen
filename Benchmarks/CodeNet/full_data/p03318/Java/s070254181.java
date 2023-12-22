import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        long[] ans = solve(K);
        for (int i=0; i<K; i++) {
            System.out.println(ans[i]);
        }
    }

    private static long[] solve(int K) {
        long[] ans = new long[K+1];
        for (int i=0; i<K; i++) {
            if (i < 9) {
                ans[i] = i+1;
            } else if (i == 9) {
                ans[i] = 19;
            }
            else {
                ans[i] = ans[i-1]*10+9;
            }
        }

        return ans;
    }
}

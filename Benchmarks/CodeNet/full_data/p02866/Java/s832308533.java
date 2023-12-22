import java.util.Scanner;

/**
 * Counting of Trees
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] D = new int[N];
            for (int i = 0; i < N; i++) {
                D[i] = sc.nextInt();
            }

            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[D[i]]++;
            }

            if (D[0] != 0 || C[0] != 1) {
                System.out.println(0);
                return;
            }

            long ans = 1;
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < C[i]; j++) {
                    ans = ans * C[i - 1] % 998244353;
                }
            }

            System.out.println(ans);
        }
    }

}

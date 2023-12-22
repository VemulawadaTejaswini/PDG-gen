import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int M = sc.nextInt();
            int[] D = new int[M];
            long[] C = new long[M];
            for (int i = 0; i < M; i++) {
                D[i] = sc.nextInt();
                C[i] = sc.nextLong();
            }

            long ans = 0;
            long x = 0;
            for (int i = 0; i < M; i++) {
                ans += C[i];

                x += D[i] * C[i];
                ans += (x - 1) / 9;
                x = (x - 1) % 9 + 1;
            }

            ans = ans - 1;

            System.out.println(ans);
        }
    }

}

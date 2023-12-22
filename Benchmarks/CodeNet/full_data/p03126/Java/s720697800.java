import java.util.Scanner;

/**
 * ABC118B
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = 0;
        int A = 0;
        int[] food = new int[M];
        for (int i = 0; i < N; i++) {
            K = sc.nextInt();
            for (int j = 0; j < K; j++) {
                A = sc.nextInt();
                food[A - 1]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < M; i++) {
            if (food[i] == N) {
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
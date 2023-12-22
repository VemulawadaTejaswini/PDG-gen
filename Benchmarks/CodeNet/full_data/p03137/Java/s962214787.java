import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        sc.close();

        if (N >= M) {
            System.out.println(0);
            System.exit(0);
        } else {
            Arrays.sort(X);
            int[] dist = new int[M - 1];
            for (int i = 0; i < M - 1; i++) {
                dist[i] = X[i + 1] - X[i];
            }
            Arrays.sort(dist);
            int sum = 0;
            for (int i = 0; i < M - N; i++) {
                sum += dist[i];
            }
            System.out.println(sum);
        }
    }
}
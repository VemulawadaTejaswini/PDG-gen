import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                int dx1 = x[j]-x[i];
                int dy1 = y[j]-y[i];

                int val = 1;
                for (int p = 0; p < N; p++) {
                    for (int q = 0; q < N; q++) {
                        if (p == q || (i == p && j == q)) {
                            continue;
                        }
                        int dx2 = x[q]-x[p];
                        int dy2 = y[q]-y[p];
                        if (dx1 == dx2 && dy1 == dy2) {
                            val++;
                        }
                    }
                }
                ans = Math.min(ans, N-val);
            }
        }

        System.out.println(ans);
    }
}

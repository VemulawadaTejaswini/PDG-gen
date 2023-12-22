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
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                int dx1 = x[j]-x[i];
                int dy1 = y[j]-y[i];

                int val = 1;
                for (int p = 0; p < N-1; p++) {
                    for (int q = p+1; q < N; q++) {
                        if (i == p && j == q) {
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

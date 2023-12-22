import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for(int i=0;i<N;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        long[] ans = new long[3];
        int c=0;
        for (int cx = 0; cx <=100; cx++) {
            for (int cy = 0; cy <=100; cy++) {
                for (int i = 1; i < N; i++) {
                    if (h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy) != h[i - 1] + Math.abs(x[i - 1] - cx) + Math.abs(y[i - 1] - cy)) {
                        break;
                    }
                    if (i == N - 1) {
                        c++;
                        ans[0] = cx;
                        ans[1] = cy;
                        ans[2] = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}

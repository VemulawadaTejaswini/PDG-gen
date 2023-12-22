import java.util.Scanner;

public class Solution {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] C = new int[N+1];
        int[] D = new int[N+1];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            C[A[i]] += 1;
        }

        for(int i = 0; i <= N; i++) {
            D[C[i]] += 1;
        }

        int[] Dk_cumsum = new int[N+1];
        int[] D_cumsum = new int[N+1];

        D_cumsum[N] = D[N];
        for(int k = 1; k <= N; k++) {
            Dk_cumsum[k] = Dk_cumsum[k-1] + k*D[k];
            D_cumsum[N-k] = D_cumsum[N-k+1] + D[N-k];
        }

        int[] f = new int[N+1];
        for(int X = 1; X <= N; X++) {
            if(X == N) {
                f[X] = Dk_cumsum[X] / X;
            } else {
                f[X] = (Dk_cumsum[X] + X * D_cumsum[X+1]) / X;
            }
        }

        for(int K = 1; K <= N; K++) {
            //find X maximal, with K <= f(X)
            int x = 0;
            if(f[1] >= K) {
                if(K <= f[N]) {
                    System.out.println(N);
                } else {
                    for (int b = N; b >= 1; b /=2) {
                        while(K <= f[x+b]) x += b;
                    }
                    System.out.println(x);
                }
            } else {
                System.out.println("0");
            }
        }
    }
}
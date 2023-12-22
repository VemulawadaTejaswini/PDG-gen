import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] C = new int[N+1];
        int[] D = new int[N+1];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
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
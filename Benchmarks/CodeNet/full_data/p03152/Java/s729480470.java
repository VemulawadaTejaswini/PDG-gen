import java.util.*;

public class Main {
    public static final int MOD = 1_000_000_007;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++) {
            B[i] = sc.nextInt();
        }

        long ans = solve(N, M, A, B);
        // long ans = solve4004049(N, M, A, B);

        System.out.println(ans);
    }

    /**
     *
     */
    private static long solve(int N, int M, int[] A, int[] B) {
        Arrays.sort(A);
        A = reverse(A);
        Arrays.sort(B);
        B = reverse(B);
        System.err.println("A = " + Arrays.toString(A));
        System.err.println("B = " + Arrays.toString(B));

        int p = 0;
        int q = 0;
        long ans = 1;
        int rest = 0;

        if (A[0] != N*M || B[0] != N*M) return 0; 
        
        for (int i=N*M-1; i>=1; i--) {
            boolean P = p+1 < N && A[p+1] == i;
            boolean Q = q+1 < M && B[q+1] == i;
            // System.err.println("A[p] = A[" + p + "] = " + A[p]);
            // System.err.println("B[q] = B[" + q + "] = " + B[q]);
            // System.err.println("P: " + P + ", Q: " + Q);

            if (P) {
                p++;
                rest += q+1;
            }
            if (Q) {
                q++;
                rest += p+1;
            }

            if (P && Q) {
                // nothing
            } else if (P) {
                ans = ans * (q+1) % MOD;
            } else if (Q) {
                ans = ans * (p+1) % MOD;
            } else {
                ans = ans * rest % MOD;
            }

            rest--;
            if (rest < 0) {
                System.err.println("rest = " + rest);
                return 0;
            }

            // System.err.println("ans=" + ans + ", rest=" + rest);
        }

        return ans;
    }

    /**
     * satanicさんの写経
     * https://atcoder.jp/contests/keyence2019/submissions/4004049
     * 解説: https://twitter.com/satanic0258/status/1084453961904451584
     */
    private static long solve4004049(int N, int M, int[] A, int[] B) {
        Arrays.sort(A);
        A = reverse(A);
        Arrays.sort(B);
        B = reverse(B);
        System.err.println("A = " + Arrays.toString(A));
        System.err.println("B = " + Arrays.toString(B));

        int[][] pos = new int[2][N*M+1];
        Arrays.fill(pos[0], -1);
        Arrays.fill(pos[1], -1);

        for (int i=0; i<N; i++) {
            if (pos[0][A[i]] != -1) return 0;
            pos[0][A[i]] = i;
            // System.err.println("pos[0][" + A[i] + "] = " + pos[0][A[i]]);
        }
        for (int j=0; j<M; j++) {
            if (pos[1][B[j]] != -1) return 0;
            pos[1][B[j]] = j;
            // System.err.println("pos[1][" + B[j] + "] = " + pos[1][B[j]]);
        }
        System.err.println("pos[0] = " + Arrays.toString(pos[0]));
        System.err.println("pos[1] = " + Arrays.toString(pos[1]));

        
        if (pos[0][N*M] == -1 || pos[1][N*M] == -1) {
            System.err.println("max value not exist (" + pos[0][N*M] + ", " + pos[1][N*M] + ")");
            return 0;
        }

        int p = 0;
        int q = 0;
        long ans = 1;
        int rest = 0;

        for (int i=N*M-1; i>=1; i--) {
            boolean P = pos[0][i] == p+1;
            boolean Q = pos[1][i] == q+1;
            // System.err.println("A[p] = A[" + p + "] = " + A[p]);
            // System.err.println("B[q] = B[" + q + "] = " + B[q]);
            // System.err.println("P: " + P + ", Q: " + Q);

            if (P) {
                p++;
                rest += q+1;
            }
            if (Q) {
                q++;
                rest += p+1;
            }

            if (P && Q) {
                // nothing
            } else if (P) {
                ans = ans * (q+1) % MOD;
            } else if (Q) {
                ans = ans * (p+1) % MOD;
            } else {
                ans = ans * rest % MOD;
            }

            rest--;
            if (rest < 0) {
                System.err.println("rest = " + rest);
                return 0;
            }

            System.err.println("ans=" + ans + ", rest=" + rest);
        }

        return ans;
    }


    private static int[] reverse(int[] A) {
        int[] reverse = A.clone();
        for (int i=0; i<A.length; i++) {
            reverse[i] = A[A.length-i-1];
        }

        return reverse;
    }
}

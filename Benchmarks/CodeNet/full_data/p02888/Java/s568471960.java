import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }

        System.out.println(solve3(N, L));
    }

    /**
     * 愚直な実装でこれだとTLE
     * @param N
     * @param L
     * @return
     */
    private static int solve(int N, int[] L) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    if (L[i] < L[j] + L[k] && L[j] < L[k] + L[i] && L[k] < L[i] + L[j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    /**
     * 三角形を構成する2辺を事前に選んだとき，残りの1辺を三角形の成立条件と累積和により求める．
     *
     * @param N
     * @param L
     * @return
     */
    private static long solve2(int N, int[] L) {
        long count = 0;

        // i以上の辺の数を求める
        int[] numGreaterOrEqualToL = new int[1000 + 2];
        Arrays.sort(L);
        int idx = 0;
        for (int i=1000; i>=0; i--) {
            numGreaterOrEqualToL[i] = numGreaterOrEqualToL[i+1];
            while (idx < N && i == L[N - idx - 1]) {
                numGreaterOrEqualToL[i]++;
                idx++;

                // System.err.println("OL[" + i + "] = " + numGreaterOrEqualToL[i]);
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                // 三角形の成立条件 c < a + b, c > a - b, c > b - a
                int kMax = Math.min(1000+1, L[i]+L[j]);
                int kMin = Math.abs(L[i]-L[j]);

                count += numGreaterOrEqualToL[kMin+1] - numGreaterOrEqualToL[kMax];
                if (kMin < L[i] && L[i] < kMax) count--;
                if (kMin < L[j] && L[j] < kMax) count--;

                // System.err.println("i=" + L[i] + ", j=" + L[j] + " = " + count);
            }
        }

        // 同じ三角形を3回選んでいるので1/3が求める数
        return count/3;
    }

    /**
     * 2分探索で求める
     * @param N
     * @param L
     * @return
     */
    private static long solve3(int N, int[] L) {
        long count = 0;

        Arrays.sort(L);
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                int l = L[i] + L[j];
                int lb = lowerBound(L, l);

                count += lb - j - 1;
            }
        }

        return count;
    }

    /**
     * l <= L_i を満たす最小の i を返す
     * @param L
     * @param l
     * @return
     */
    private static int lowerBound(int[] L, int l) {
        int lb = -1;
        int ub = L.length;

        while (ub - lb > 1) {
            int mid = (ub+lb)/2;
            if (l <= L[mid]) {
                ub = mid;
            } else {
                lb = mid;
            }
        }

        return ub;
    }
}
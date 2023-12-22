import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for ( int i = 0; i < N; i++ ) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Result s = calc(N, K, a, b);
        System.out.println(s.sum);
    }

    private static class Result {
        private final long sum;
        private final long bitsum;
        public Result(long sum, long bitsum) {
            this.sum = sum;
            this.bitsum = bitsum;
        }
    }

    private static Result calc(int N, int K, int[] a, int[] b) {
        if ( N == 0 ) return new Result(0L, 0L);
        if ( N == 1 ) return a[0] <= K ? new Result(b[0], a[0]) : new Result(0L, 0L);
        Result result = new Result(0L,0L);
        for ( int i = 0; i < N; i++ ) {
            int[] aa = smaller(a, i);
            int[] bb = smaller(b, i);
            Result r = calc(N-1, K, aa, bb);
            long bitsum = r.bitsum | a[i];
            if ( bitsum <= K ) {
                r = new Result(r.sum + b[i], bitsum);
            }
            if ( r.sum > result.sum ) {
                result = r;
            }
        }
        return result;
    }

    private static int[] smaller(int[] c, int exceptIndex) {
           int N = c.length;
           int[] r = new int[N-1];
           if ( exceptIndex > 0 ) {
               System.arraycopy(c, 0, r, 0, exceptIndex);
           }
           if ( exceptIndex < N - 1 ) {
               System.arraycopy(c, exceptIndex + 1, r, exceptIndex, N - 1 - exceptIndex);
           }
           return r;
    }
}
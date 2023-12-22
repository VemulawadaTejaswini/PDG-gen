import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        long[] as = new long[N];
        for (int i = 0; i < N; i++) {
            as[i] = sc.nextLong();
        }

        System.out.println( solve(N, x, as) );
    }

    private static long solve(int N, int x, long[] as) {
        if( N > 2 ) {
            return solve3(N, x, as);
        } else {
            return solve2(N, x, as);
        }
    }

    private static long solve3(int N, int x, long[] as) {
        long ans = 0;
        for (int i = 1; i < N-1; i++) {
            long a = as[i];
            long prev = as[i-1];
            long next = as[i+1];

            if( a + prev > x ) {
                long eat = Math.min((a + prev) - x, a);
                a = a - eat;
                ans += eat;
            }

            if( a + next > x ) {
                long eat = Math.min((a + next) - x, a);
                a = a - eat;
                ans += eat;
            }
            as[i] = a;
        }

        if( as[0] + as[1] > x ) {
            long eat = Math.min((as[0] + as[1]) - x, as[0]);
            ans += eat;
            as[0] -= eat;
        }

        if( as[N-1] + as[N-2] > x ) {
            long eat = Math.min((as[N-1] + as[N-2]) - x, as[N-1]);
            ans += eat;
            as[N-1] -= eat;
        }

        return ans;
    }

    private static long solve2(int N, int x, long[] as) {
        long first = as[0];
        long last = as[1];

        if( first + last > x ) {
            return (first + last) - x;
        } else {
            return 0;
        }
    }
}
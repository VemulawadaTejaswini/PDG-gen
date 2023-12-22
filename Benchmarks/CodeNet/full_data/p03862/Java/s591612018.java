import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] as = new int[N];
        for (int i = 0; i < N; i++) {
            as[i] = sc.nextInt();
        }

        System.out.println( solve(N, x, as) );
    }

    private static long solve(int N, int x, int[] as) {
        if( N > 2 ) {
            return solve3(N, x, as);
        } else {
            return solve2(N, x, as);
        }
    }

    private static long solve3(int N, int x, int[] as) {
        long ans = 0;
        for (int i = 1; i < N-1; i++) {
            int a = as[i];
            int prev = as[i-1];
            int next = as[i+1];

            if( a + prev > x ) {
                int eat = Math.min((a + prev) - x, a);
                a = a - eat;
                ans += eat;
            }

            if( a + next > x ) {
                int eat = Math.min((a + next) - x, a);
                a = a - eat;
                ans += eat;
            }
            as[i] = a;
        }

        if( as[0] + as[1] > x ) {
            int eat = Math.min((as[0] + as[1]) - x, as[0]);
            ans += eat;
            as[0] -= eat;
        }

        if( as[N-1] + as[N-2] > x ) {
            int eat = Math.min((as[N-1] + as[N-2]) - x, as[N-1]);
            ans += eat;
            as[N-1] -= eat;
        }

        return ans;
    }

    private static long solve2(int N, int x, int[] as) {
        int first = as[0];
        int last = as[1];

        if( first + last > x ) {
            return (first + last) - x;
        } else {
            return 0;
        }
    }
}
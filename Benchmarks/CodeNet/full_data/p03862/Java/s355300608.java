import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        long[] as = new long[N];
        for (int i = 0; i < N; i++) {
            as[i] = sc.nextLong();
        }

        System.out.println( solve(N, x, as) );
    }

    private static long solve(int N, long x, long[] as) {
        long ans = 0;
        if( as[0] > x ) {
            ans += as[0] - x;
            as[0] = x;
        }

        for (int i = 1; i < N; i++) {
            long a = as[i];
            long prev = as[i-1];

            if( a + prev > x ) {
                long eat = (a + prev) - x;
                ans += eat;
                as[i] -= eat;
            }
        }
        return ans;
    }
}
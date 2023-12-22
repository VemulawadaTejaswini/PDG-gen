import java.util.*;

class Main {
    public static void main(String[] args) {
        final int MOD = 1_000_000_007;
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final long x[] = new long[N];
        for (int i=0; i<N; i++) {
            x[i] =  Long.parseLong(sc.next());
        }
        sc.close();

        long sum = 0;
        for (int i=1; i<N; i++) {
            sum += x[i];
            sum %= MOD;
        }
//        sum -= x[1] - x[0];
        int m = N - 2;
        while (m>0) {
            sum *= m;
            sum %= MOD;
            m--;
        }
        System.out.println(sum);
    }
}
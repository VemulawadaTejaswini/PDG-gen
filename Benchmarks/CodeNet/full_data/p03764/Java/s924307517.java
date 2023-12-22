import java.util.*;

public final class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n  = s.nextInt();

        int m = s.nextInt();

        long mod = 1000000000 + 7;

        long[] x = new long[n];

        for (int i = 0; i < n; i++) {

            x[i] = s.nextInt();
        }


        long[] y = new long[m];

        for (int i = 0; i < m; i++) {

            y[i] = s.nextInt();
        }


        long sum_interval = 0;

        long before_inteval = 0;
        for (int i = 1; i< m; i++) {

            long interval = y[i] - y[i-1];

            long now = before_inteval + (interval*i)%mod;

            before_inteval = now;

            sum_interval += now;
        }

        sum_interval = sum_interval %mod;

        long result = 0;
        long before_sum = 0;
        for (int i = 1; i < n; i++) {

            long x1 = x[i];

            long x2 = x[i-1];

            long xint = x1-x2;

            long now = xint * sum_interval;

            long r = (now%mod*i)%mod + before_sum;

            before_sum = r;

            result += r;
        }

        System.out.print(result%mod);
    }


}
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

        long before = 0;

        long result = 0;

        for (int i = 1; i < x.length;i++) {

            long x2 = x[i];

            long x1 = x[i-1];

            long interval = x2 - x1;

            long sum = 0;
            long innerbefore = 0;

            for (int j = 1; j < y.length; j++) {

                long y2 = y[j];
                long y1 = y[j-1];

                long intv = y2 - y1;

                long local = interval * intv;

                long now = (local%mod * j)%mod + innerbefore;

                sum += now;

                innerbefore = now;

            }

            long k = before + (sum%mod*i)%mod;

            result += k;

            before = k;
        }

        System.out.print(result%mod);
    }


}
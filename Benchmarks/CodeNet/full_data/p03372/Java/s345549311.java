import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n;
    long c;
    long[] xs, vs;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        c = sc.nextLong();
        xs = new long[n + 2];
        vs = new long[n + 2];
        for (int i = 1; i <= n; i++) {
            xs[i] = sc.nextLong();
            vs[i] = sc.nextLong();
        }
        xs[n + 1] = c;
        solve();
    }

    void solve() {
        long[] vSumToI = new long[n + 1];
        long[] vSumToJ = new long[n + 2];
        long[] maxVSumForJ = new long[n + 1];
        int[] maxVSumForJIndex = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            vSumToI[i] = vSumToI[i - 1] + xs[i - 1] + vs[i] - xs[i];
        }
        vSumToJ[n] = vs[n] - c + xs[n];
        for (int i = n - 1; i >= 1; i--) {
            vSumToJ[i] = vSumToJ[i + 1] - xs[i + 1] + vs[i] + xs[i];
        }
        maxVSumForJ[0] = 0;
        int maxIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (maxVSumForJ[i - 1] > vSumToI[i]) {
                maxVSumForJ[i] = maxVSumForJ[i - 1];
            } else {
                maxVSumForJ[i] = vSumToI[i];
                maxIndex = i;
            }
            maxVSumForJIndex[i] = maxIndex;
        }
        long maxCal = 0;
        for (int i = 1; i <= n + 1; i++) {
            long tempMaxCal = maxVSumForJ[i - 1] + vSumToJ[i];
            if (c - xs[i] < xs[maxVSumForJIndex[i - 1]]) {
                tempMaxCal -= c - xs[i];
            } else {
                tempMaxCal -= xs[maxVSumForJIndex[i - 1]];
            }
            maxCal = Math.max(maxCal, tempMaxCal);
        }
        System.out.println(maxCal);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}

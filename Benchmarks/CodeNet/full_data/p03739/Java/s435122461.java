import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n;
    int[] as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        long[] sums = new long[n];
        sums[0] = as[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + as[i];
        }
        long evenCount = 0;
        long evenChange = 0;
        long[] sumsForEven = sums.clone();
        for (int i = 0; i < n; i++) {
            sumsForEven[i] += evenChange;
            if (i % 2 == 0 && sumsForEven[i] <= 0) {
                evenCount += -sumsForEven[i] + 1;
                evenChange += -sumsForEven[i] + 1;
                sumsForEven[i] = 1;
            } else if (i % 2 == 1 && sumsForEven[i] > 0) {
                evenCount += sumsForEven[i] + 1;
                evenChange -= sumsForEven[i] + 1;
                sumsForEven[i] = -1;
            }
        }
        long oddCount = 0;
        long oddChange = 0;
        for (int i = 0; i < n; i++) {
            sums[i] += oddChange;
            if (i % 2 == 1 && sums[i] <= 0) {
                oddCount += -sums[i] + 1;
                oddChange += -sums[i] + 1;
                sums[i] = 1;
            } else if (i % 2 == 0 && sums[i] > 0) {
                oddCount += sums[i] + 1;
                oddChange -= sums[i] + 1;
                sums[i] = -1;
            }
        }
        System.out.println(Math.min(evenCount, oddCount));
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
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

        String nextLine() {
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

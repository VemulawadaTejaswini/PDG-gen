import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    int n;
    long[] as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        Combination c = new Combination(300000, 1000000007);
        long[] xors = new long[n + 1];
        long[] sums = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            xors[i] = xors[i - 1] ^ as[i - 1];
            sums[i] = sums[i - 1] + as[i - 1];
        }
        int l = 0;
        int r = 1;
        int count = 0;
        for (int i = 0; i < n;) {
            int low = i;
            int high = n + 1;
            while (high - low > 1) {
                int mid = (low + high) / 2;
                long sum = sums[mid] - sums[i];
                long xor = xors[mid] ^ xors[i];
                if (sum > xor) {
                    high = mid;
                } else {
                    low = mid;
                }
            }
            //System.out.println(i + " " + low + " " + (sums[low] - sums[i]) +
            //        " " + (xors[low] ^ xors[i]) + " " + c.combRep(low - i, 2));
            //count += c.combRep(low - i, 2);
            count += low - i;
            System.out.println(i + " " + low);
            /*
            if (low > i + 1) {
                i = low -1;
                count--;
            } else {
                i = low;
            }
            */
            i++;

            /*
            for (int j = i + 1; j <= n; j++) {
                long sum = sums[j] - sums[i];
                long xor = xors[j] ^ xors[i];


                if (sum == xor) {
                    count++;
                }
            }
            */
        }
        System.out.println(count);

        /*
        while (l < n) {
            long sum = sums[r] - sums[l];
            long xor = xors[r] ^ xors[l];
            int r2 = r;
            long sum2 = sum;
            long xor2 = xor;
            while (r2 < n && sum2 == xor2) {
                System.out.println("  " + l + " " + r2 + " " + sum2 + " " + xor2);
                r2++;
                sum2 = sums[r2] - sums[l];
                xor2 = xors[r2] - xors[l];
            }
            if (r2 == n && sum2 == xor2) {
                count += c.combRep(r2 - l, 2);
                System.out.println("here" + l + " " + r2 + " " + c.combRep(r2 - l, 2));
            } else if (r == r2) {

            } else {
                count += c.combRep(r2 - 1 - l, 2);
                System.out.println(l + " " + (r2 - 1) + " " + c.combRep(r2 - 1 - l, 2));
            }
            if (r == r2) {
                l++;
                r = l + 1;
            } else if (r2 == n && sum2 == xor2) {
                l = r2;
                r = l + 1;
            } else {
                l = r2 - 1;
                r = l + 1;
            }

            if (sum == xor) {
                System.out.println(l + " " + r);
                count++;
            }
            if (sum > xor || r == n) {
                l++;
            } else {
                r++;
            }

        }
        System.out.println(Arrays.toString(sums));
        System.out.println(Arrays.toString(xors));
        System.out.println(count);
        */
    }

    class Combination {
        long mod;
        int[] facts;
        int[] invs;
        int[] invFacts;

        public Combination(int max, int mod) {
            this.mod = mod;
            facts = new int[max + 2];
            invs = new int[max + 2];
            invFacts = new int[max + 2];
            invs[1] = 1;
            for (int i = 2; i <= max + 1; i++) {
                invs[i] = (int)((long)invs[mod % i] * (mod - mod / i) % mod);
            }
            facts[0] = 1;
            invFacts[0] = 1;
            for (int i = 1; i <= max + 1; i++) {
                facts[i] = (int)(facts[i - 1] * (long)i % mod);
                invFacts[i] = (int)(invFacts[i - 1] * (long)invs[i] % mod);
            }
        }

        long comb (int n, int k) {
            if (k < 0 || k > n) return 0;
            return facts[n] * (long)invFacts[k] % mod * (long)invFacts[n - k] % mod;
        }

        long combRep(int n, int k) {
            return comb(n + k - 1, k);

        }
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

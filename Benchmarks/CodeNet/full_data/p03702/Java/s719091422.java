import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n, a, b;
    int[] hs;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        hs = new int[n];
        for (int i = 0; i < n; i++) {
            hs[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        int low = 0;
        int high = 1000000001;
        while (low < high) {
            int mid = (low + high) >> 1;
            long count = mid;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                long temp = hs[i] - b * mid;
                if (temp > 0) {
                    count -= (long)Math.ceil((hs[i] - b * mid) / (a - b));
                    if (count < 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
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

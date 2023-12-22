import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        Arrays.sort(as);
        /*
        SortedMap<Integer, Integer> map = new TreeMap<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(as[i])) {
                map.put(as[i], j++);
            }
        }
        */
        int l = 0;
        int r = n - 1;
        int ans = n;
        while (l < r - 1) {
            while (l < n - 1 && as[l] != as[l + 1]) {
                l++;
            }
            while (r > 0 && as[r] != as[r - 1]) {
                r--;
            }
            if (l < r - 1) {
                ans -= 2;
                l++;
                r--;
            } else if (l == r - 1) {
                ans -= 2;
                break;
            }
        }
        System.out.println(ans);
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

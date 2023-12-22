import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    char[] ss, ts;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        ss = sc.next().toCharArray();
        ts = sc.next().toCharArray();
        solve();
    }

    void solve() {
        SortedSet<Character> setSS = new TreeSet<>();
        for (int i = 0; i < ss.length; i++) {
            setSS.add(ss[i]);
        }
        SortedSet<Character> setTS = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < ts.length; i++) {
            setTS.add(ts[i]);
        }
        Iterator<Character> ssIt = setSS.iterator();
        Iterator<Character> tsIt = setTS.iterator();
        while (ssIt.hasNext() && tsIt.hasNext()) {
            char s = ssIt.next();
            char t = tsIt.next();
            if (s < t) {
                System.out.println("Yes");
                return;
            } else if (s > t) {
                System.out.println("No");
                return;
            }
        }
        if (tsIt.hasNext()) {
            System.out.println("Yes");
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

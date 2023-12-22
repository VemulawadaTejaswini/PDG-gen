import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    int cnt = 0;

    class T implements Comparable<T> {
        String s;
        int id = cnt++;

        public T(String s) {
            this.s = s;
        }

        @Override
        public int compareTo(T o) {
            int c = s.compareTo(o.s);
            if (c != 0) {
                return c;
            }
            return Integer.compare(id, o.id);
        }
    }

    String getMin(String s) {
        String res = s;
        for (int i = 1; i < s.length(); i++) {
            String t = s.substring(i) + s.substring(0, i);
            if (t.compareTo(res) < 0) {
                res = t;
            }
        }
        return res;
    }

    void check(String s) {
        ArrayList<Character> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            a.add(c);
        }
        char[] tmp = new char[s.length()];
        for (int it = 0; it < 1231; it++) {
            Collections.shuffle(a);
            int z = 0;
            for (char c : a) {
                tmp[z++] = c;
            }
            String xx = new String(tmp);
            if (getMin(xx).compareTo(s) > 0) {
                throw new AssertionError();
            }
        }
    }

    String solve(int x, int y, int z) {
        if (x + y + z == 0) {
            return "";
        }
        TreeSet<T> ts = new TreeSet<>();
        for (int i = 0; i < x; i++) {
            ts.add(new T("a"));
        }
        for (int i = 0; i < y; i++) {
            ts.add(new T("b"));
        }
        for (int i = 0; i < z; i++) {
            ts.add(new T("c"));
        }
        while (ts.size() > 1) {
            T first = ts.pollFirst();
            T last = ts.pollLast();
            ts.add(new T(first.s + last.s));
        }
        String res = (ts.first().s);
        check(res);
        return res;
    }

    void solve123() {
        final int M = 10;
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < M; y++) {
                for (int z = 0; z < M; z++) {
                    solve(x, y, z);
                    System.err.println(x + " " + y + " "+ z);
                }
            }
        }
    }

    void solve() {
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        out.println(solve(x, y, z));
    }

    private void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Main {

    void solve() {
        int n = in.nextInt();
        HashMap<Character, Integer> startsWithCount = new HashMap<>();
        HashSet<Character> allowed = new HashSet<>();
        allowed.add('M');
        allowed.add('A');
        allowed.add('R');
        allowed.add('C');
        allowed.add('H');
        for (int i = 0; i < n; i++) {
            String name = in.next();
            if (allowed.contains(name.charAt(0))) {
                if (startsWithCount.get(name.charAt(0)) == null) {
                    startsWithCount.put(name.charAt(0), 0);
                }
                startsWithCount.put(name.charAt(0), startsWithCount.get(name.charAt(0)) + 1);
            }
        }
        long ans = 0;
        ArrayList<Character> all = new ArrayList<>(allowed);
        for (int i = 0; i < all.size(); i++) {
            if (!startsWithCount.containsKey(all.get(i))) continue;
            for (int j = i + 1; j < all.size(); j++) {
                if (!startsWithCount.containsKey(all.get(j))) continue;
                for (int k = j + 1; k < all.size(); k++) {
                    if (!startsWithCount.containsKey(all.get(k))) continue;
                    ans += startsWithCount.get(all.get(i)) 
                            * startsWithCount.get(all.get(j)) 
                            * startsWithCount.get(all.get(k));
                }
            }
        }
        out.println(ans);
    }

    Scanner in;
    PrintWriter out;

    void run() {
        try {
            in = new Scanner(new File("A.in"));
            out = new PrintWriter(new File("A.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new Scanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public Scanner(InputStream f) {
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

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private int skip() {
            int b;
            while ((b = read()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        private int read() {
            int res = -1;
            try {
                res = br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }

        char[] nextCharArray(int size) {
            char[] buf = new char[size];
            int b = skip(), p = 0;
            while (p < size && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = read();
            }
            return size == p ? buf : Arrays.copyOf(buf, p);
        }

        char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextCharArray(m);
            }
            return map;
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
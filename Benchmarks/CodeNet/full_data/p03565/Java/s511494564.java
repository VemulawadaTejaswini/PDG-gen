
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        final String BADRESULT = "UNRESTORABLE";
        String S = in.nextToken();
        String T = in.nextToken();

        int startIndex = 0;
        for (int i = 0; i < S.length(); i++) {
            if (compare(T, S.substring(i, i + T.length()))) {
                startIndex = i;
                break;
            } else if (i + T.length() >= S.length()) {
                out.println(BADRESULT);
                return;
            }
        }
        StringBuilder sb = new StringBuilder(S);
        sb.replace(startIndex, startIndex + T.length(), T);
        out.println(sb.toString().replaceAll("\\?", "a"));
    }

    boolean compare(String T, String sub) {
        for (int i = 0; i < T.length(); i++) {
            if (sub.charAt(i) == '?') {
                continue;
            } else if (T.charAt(i) != sub.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}
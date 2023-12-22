
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    void solve() {
        String input = in.nextToken();
        int letters[] = new int[26];
        int len = input.length();
        long result = (long)len * (len + 1) / 2;
        for (int i = 0 ; i < len ; i++) {
            letters[input.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < len ; i++){
            result -= letters[input.charAt(i) - 'a'];
            letters[input.charAt(i) - 'a']--;
        }
        result += 1;
        out.print(result);
    }


    FastScanner in;
    PrintWriter out;

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

    public static void main(String[] args) {
        new Main().run();
    }

}
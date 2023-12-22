
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long result = 0;
        indexa : for (int i = 0; i < N; i++) {
            indexb : for (int j = 0; j < N; j++) {
                if (A[i] >= B[j]) {
                    continue indexb;
                }
                indexc : for (int k = 0; k < N; k++) {
                    if (B[j] >= C[k]) {
                        continue indexc;
                    } else {
                        result++;
                    }
                }
            }
        }
        out.println(result);
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
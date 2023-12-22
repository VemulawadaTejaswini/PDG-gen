
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();
        int f = 0;
        boolean pair = true;
        int[] arr = new int[in];
        for (int i = 0; i < in; i++ ) {
            int y = sc.nextInt();
            arr[i] = y;
        }
        for (int i = 0; i < in; i++) {
            for (int j = i; j < in - 1; j++) {
                if (arr[i] == arr[j+1])
                    pair = false;
            }
        }
        pw.println(pair? "YES" : "NO");


        pw.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String file) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}



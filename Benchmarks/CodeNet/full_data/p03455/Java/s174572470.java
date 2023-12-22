import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static class Reader {
        private BufferedReader br;
        private StringTokenizer token;

        protected Reader(InputStream obj) {
            br = new BufferedReader(new InputStreamReader(obj));
            token = null;
        }
        protected String next() {
            while (token == null || !token.hasMoreElements()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {e.printStackTrace();}
            }
            return token.nextToken();
        }
        protected int[] nextIntArr(int n) {
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
        protected int nextInt() {return Integer.parseInt(next());}
    }


    public static void main(String[] args) throws IOException {
        Reader in = new Reader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt(), b = in.nextInt();
        if (((a*b)&1) == 0) out.printf("%s\n", "Even");
        else out.printf("%s\n", "Odd");
        out.close();
    }
}
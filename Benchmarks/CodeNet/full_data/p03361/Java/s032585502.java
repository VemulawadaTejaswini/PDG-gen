import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] a = new char[n][m];
        for(int i = 0; i<n; i++){
            String s = in.next();
            for(int j = 0; j<m; j++){
                a[i][j] = s.charAt(j);
            }
        }
        boolean print = true;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(a[i][j] == '#'){
                    if(!check(i,j,a)){
                        print = false;
                        break;
                    }
                }
            }
            if(!print) break;
        }
        if(print) out.println("Yes");
        else out.println("No");
        out.close();
    }
    static boolean check(int i, int j, char[][] a){
        for(int k = 0; k<4; k++){
            int t1 = i+dx[k];
            int t2 = j+dy[k];
            if(t1>=0 && t1<a.length && t2>=0 && t2<a[0].length && a[t1][t2] == '#') return true;
        }
        return false;
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = reader.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            tokenizer = new StringTokenizer(next);
            return true;
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}


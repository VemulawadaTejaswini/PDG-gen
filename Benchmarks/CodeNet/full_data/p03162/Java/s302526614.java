import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
         // for declaring
        int n ;
        int [] swim,homework,bugs ;

        public void solve(int testNumber, InputReader in, PrintWriter out) {

                n = in.nextInt();
                swim = new int[n];
                homework = new int[n];
                bugs = new int[n];
                for(int i = 0 ; i < n ; i++ ){
                    swim[i] = in.nextInt();
                    homework[i] = in.nextInt();
                    bugs[i] = in.nextInt();
                }
                int[][] happiness = new int[n+1][3];
                for( int i = 1 ; i <= n ; i++ ){
                    happiness[i][0] = Math.max(happiness[i-1][1],happiness[i-1][2]) + swim[i-1] ;
                    happiness[i][1] = Math.max(happiness[i-1][0],happiness[i-1][2]) + homework[i-1] ;
                    happiness[i][2] = Math.max(happiness[i-1][1],happiness[i-1][0]) + bugs[i-1] ;
                }
                out.println(Math.max(happiness[n][0],Math.max(happiness[n][1],happiness[n][2])));
            }
        }


    }

    class InputReader {
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

    }



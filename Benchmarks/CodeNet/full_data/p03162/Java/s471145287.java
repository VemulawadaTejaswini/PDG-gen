import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i <n; i++) {
                a[i]=in.nextInt();
                b[i]=in.nextInt();
                c[i]=in.nextInt();
            }
            int[][] dp = new int[n][3];
            dp[n-1][0]=Math.max(b[n-1],c[n-1]);
            dp[n-1][1]= Math.max(a[n-1],c[n-1]);
            dp[n-1][2]=Math.max(a[n-1],b[n-1]);
            for (int i =n-2; i >=0 ; i--){
                for (int j = 0; j <3; j++){
                    if (j==0)dp[i][j]=Math.max(b[i]+dp[i+1][1] , c[i]+dp[i+1][2]);
                    else if (j==1)dp[i][j]=Math.max(a[i]+dp[i+1][0] , c[i]+dp[i+1][2]);
                    else dp[i][j]=Math.max(b[i]+dp[i+1][1] , a[i]+dp[i+1][0]);
                }
            }
            System.out.println(Math.max(dp[0][0] , Math.max(dp[0][1],dp[0][2])));
        }




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
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
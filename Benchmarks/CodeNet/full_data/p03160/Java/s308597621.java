package nirvana;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Nirvana {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n=in.nextInt();
            int[] heights=new int[n];
            for(int i=0;i<n;i++){
                heights[i]=in.nextInt();
            }
            int[] dp =new int[n];
            dp[0]=0;
            dp[1]=Math.abs(heights[0]-heights[1]);
            for(int i=2;i<n;i++){
                dp[i]=Math.min(dp[i-1]+Math.abs(heights[i]-heights[i-1]), dp[i-2]+Math.abs(heights[i]-heights[i-2]));
            }
            out.println(dp[n-1]);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
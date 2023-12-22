import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.*;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }


    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n,m;
            n=in.nextInt();
            m=in.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>(n ,Collections.reverseOrder());
            for (int i = 0; i <n ; i++) {
                queue.add(in.nextInt());
            }
            while (m>0){
                int v = queue.poll();
                v/=2;
                queue.add(v);
                m--;
            }
            long ans = 0;
            while (!queue.isEmpty()){
                ans+=queue.poll();
            }
            System.out.println(ans);











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
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber , InputReader in , PrintWriter out){
            int n = in.nextInt();
            int[] arr = new int[n];
            int sum2 = 0;
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
                sum2+=arr[i];
            }
            int min = Integer.MAX_VALUE;
            int sum1 = 0;
            for (int i = 0; i <n ; i++) {
                sum1+=arr[i];
                sum2-=arr[i];
                if (min > Math.abs(sum1-sum2) ) min = Math.abs(sum1-sum2);
            }
            out.println(min);
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
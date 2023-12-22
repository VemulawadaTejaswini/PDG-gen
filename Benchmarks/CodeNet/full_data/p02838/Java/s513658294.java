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
        public int log(long a){
            int num = 0;
            while (a > 0){
                num++;
                a>>=1;
            }
            return num;
        }
        public long binerypow(long a){
            if (a == 0) return 1;
            long v = binerypow(a/2);
            return v*v*(a%2==1?2:1);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long ans = 0;
            int n = in.nextInt();
            int max = 1;
            long[] arr = new long[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextLong();
                int v = log(arr[i]);
                if (v>max)max=v;
            }
            int [] zero = new int[max];
            int [] one = new int[max];
            for (int i = 0; i <n; i++){
                int j = 0;
                while (j<max){
                    if ((arr[i]&1) == 1) one[j]++;
                    else zero[j]++;
                    arr[i]>>=1;
                    j++;
                }
            }

            for (int i = 0; i <max; i++) {
                if (zero[i]*one[i] > 0){
                    ans+=zero[i]*one[i]*binerypow(i);
                    ans%=(1000000000+7);
                }
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

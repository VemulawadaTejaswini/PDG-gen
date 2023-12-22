
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int[] sub = new int[N];
        int[] arr = in.nextIntArray(N-1);

        for (int i = 0; i < N - 1; i++) {
            int x = arr[i] - 1;
            sub[x] = sub[x] + 1;
        }
        for (int x : sub) {
            System.out.println(x);
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

        public int[] nextIntArray(int size){
            int arr[] =new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(next());
//                sum = sum + in.nextInt();
            }
            return arr;
        }

    }
}


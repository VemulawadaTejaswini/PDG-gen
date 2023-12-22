import java.io.*;
import java.util.*;

public class Main {
    static boolean col[];
    private static void solver(InputReader sc, PrintWriter out) {
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[2 * n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=n;i<(2*n);i++){
            arr[i] = k  + arr[i-n];
        }
        long min = Long.MAX_VALUE;
        List<Integer> al = new ArrayList<>();
        for(int i=0;i+1<(2*n);i++) {
            al.add(arr[i+1]-arr[i]);
        }
        int size = al.size();
        n--;
        for(int i=0;i+n<size;i++){
            long sum = al.get(i);
            for(int j=i+1;j<(i+n);j++){
                sum += al.get(j);
            }
            if(sum < min)
                min = sum;
        }
        out.println(min);
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in, out);
        out.close();
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

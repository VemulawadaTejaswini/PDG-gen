import java.io.*;
import java.util.*;

public class Main {

    static List<Integer> al[];
    private  static void solver(InputReader sc, PrintWriter out) {
        String s = sc.next();
        int n = s.length();
        int a = (n - 1) / 2;
        int b = ((n + 3) / 2) - 1;
        String x =s.substring(0, a);
        String y = s.substring(b,n);
        x = x.trim(); y = y.trim();
        StringBuilder sb = new StringBuilder(x);
        StringBuilder sb1 = new StringBuilder(y);
        sb.reverse(); sb1.reverse();
        if(x.equals(sb.toString()) && y.equals(sb1.toString()))
            out.println("Yes");
        else
            out.println("No");
        
    }

    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
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
        public long nextLong(){
            return Long.parseLong(next());
        }

        public long[] readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        public int[] readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}

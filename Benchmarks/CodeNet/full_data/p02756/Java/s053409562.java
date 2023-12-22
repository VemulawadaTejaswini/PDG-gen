import java.io.*;
import java.util.*;

class Main {

   static List<Integer> al[];
    private  static void solver(InputReader sc, PrintWriter out) {
        String s = sc.next();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            switch(x) {
                case 1:
                    sb.reverse();
                    break;
                case 2 :
                    int f = sc.nextInt();
                    String in = sc.next();
                    switch (f) {
                        case 1:
                            sb.insert(0, in);
                            break;
                        case 2:
                            sb.append(in);
                            break;
                    }
                    break;
                }
            }
        out.println(sb);
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

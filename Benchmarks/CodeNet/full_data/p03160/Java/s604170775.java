import java.io.*;
import java.util.*;

public class Main {

    private  static void solver(InputReader sc, PrintWriter out) {
       int n= sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i]= sc.nextInt();
       }
       long min=0;
        int i=n-1;
       for(;i-2>=0;){
           int x =Math.abs(arr[i]-arr[i-1]);
           int y =Math.abs(arr[i]-arr[i-2]);
           if( x <= y) {
               min += x;
                i--;
           }
           else {
               min += y;
                i-=2;
           }
       }
       if(i!=0){
           min += Math.abs(arr[i]-arr[0]);
       }
       out.println(min);
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
        public void readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = nextLong();
            }
        }
        public void readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
        }
    }
}
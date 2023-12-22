import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) {
        MyScanner ms = new MyScanner();
        long N = ms.nextLong();
        long K = ms.nextLong();
        long divisor = N/K;
        N-=(divisor*K);
        long min = N;
        min = Math.min(min, Math.abs(N-K));
        System.out.println(min);
    }
   static  int gcd (int a, int b) {
        return b != 0 ? gcd (b, a % b) : a;
    }
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
    
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    
        double nextDouble() {
            return Double.parseDouble(next());
        }
    
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
    
     }
}
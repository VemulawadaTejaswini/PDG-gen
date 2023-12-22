import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
public class WCS {
    
    public static void main(String[] args) throws IOException {
    	String[] s = in.nextLine().split(" ");
    	Arrays.sort(s);
    	sop(Integer.parseInt(s[2] + s[1]) + Integer.parseInt(s[0]));
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        char nextChar() {
            return in.next().charAt(0);
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static FastReader in = new FastReader();
    static OutputStream out = new BufferedOutputStream(System.out);
    
    public static byte[] toByte(Object o) {
        return String.valueOf(o).getBytes();
    }
    
    public static void sop(Object o) {
        System.out.print(o);
    }
} 
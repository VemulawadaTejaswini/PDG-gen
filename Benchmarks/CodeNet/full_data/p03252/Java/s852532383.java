import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
class Main {
    
    public static void main(String[] args) throws IOException {
    	char[] s1 = in.next().toCharArray();
    	char[] s2 = in.next().toCharArray();
    	char[] alpha = new char['z' + 1];
    	boolean ok = true;
    	for(int i = 0; i < s2.length; i ++) {
    		ok &= alpha[s1[i]] == '\0' || alpha[s1[i]] == s2[i];
    		alpha[s1[i]] = s2[i];
    		alpha[s2[i]] = s1[i];
    	}
    	sop(ok ? "Yes" : "No");
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
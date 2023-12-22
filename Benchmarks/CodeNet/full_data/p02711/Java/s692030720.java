import  java.io.*;
import  java.math.*;
import  java.util.*;


public class Main {
    public static void main(String[] args) {
    	FastReader cin = new FastReader();
    	String s = cin.next();
    	int flag = 0;
    	if(s.charAt(0) == '7' || s.charAt(1) == '7' || s.charAt(2) == '7') flag = 1;
        if(flag == 0) System.out.print("NO");
        else System.out.println("YES");
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
 
        String nextLine() {
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

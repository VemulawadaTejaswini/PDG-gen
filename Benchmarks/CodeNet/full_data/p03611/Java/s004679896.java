import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
	 static InputReader in = new InputReader(System.in);
	 static PrintWriter out = new PrintWriter(System.out);
	 
	 public static void main(String[] args) {
		 int n = in.nextInt();
		 int[] a = new int[n];
	        for(int i =0 ;i<n;i++) a[i] = in.nextInt();   
	     Arrays.sort(a);
	     int length = 1;
	     int stand = 0;
	     int around = 1;
	     while (around<n)
	     {
	    	 if(a[around]-a[stand] <=2)
	    	 {
	    		 length = Math.max(length, around-stand+1);
	    		 around++;
	    	 }
	    	 else {
	    		 stand++;
	    	 }
	     }
	     
	     out.println(length);
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
	 
	        public double nextDouble() {
	            return Double.parseDouble(next());
	        }
	 
	        public String nextLine() {
	            try {
	                return reader.readLine();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            return null;
	        }
	 
	        public boolean hasNext() {
	            String next = null;
	            try {
	                next = reader.readLine();
	            } catch (Exception e) {
	            }
	            if (next == null) {
	                return false;
	            }
	            tokenizer = new StringTokenizer(next);
	            return true;
	        }
	 
	        public BigInteger nextBigInteger() {
	            return new BigInteger(next());
	        }
	    }
	}


import java.util.*;
import java.io.*;
 
public class Main {
	
		
	
	public static void main(String args []) {
		InputReader obj = new InputReader(System.in);
		
		int a=obj.nextInt();
		if(a>=1&&a<10) {
			System.out.println(a);
		}
		else if(a>=10 && a<100) {
			System.out.println("9");
		}
		else if(a>=100 && a<1000) {
			int count=9+a-100+1;
			System.out.println(count);
		}
		else if(a>=1000&&a<10000) {
			System.out.println("909");
		}
		else if(a>=10000 && a<100000) {
			int cou=909+a-10000+1;
			System.out.println(cou);
		}
		else if(a==100000) {
			System.out.println("90909");
		}
	}
	public static class InputReader {
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
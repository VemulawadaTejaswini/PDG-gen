

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	private static BufferedReader br;
	private static StringTokenizer tokenizer;
	public static String next() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null)
                throw new IOException();
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer.nextToken();
    } 
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    } 
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    } 
    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    
	public static void main(String[] args) throws IOException {		
		
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int k = nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = nextInt();
		}
		Arrays.sort(h);
		if(k>=n) {
			System.out.println("0");
			return;
		}
		long sum = 0;
		for(int i=0;i<n-k;i++) {
			sum += h[i];
		}
		System.out.println(sum);
	}
}





















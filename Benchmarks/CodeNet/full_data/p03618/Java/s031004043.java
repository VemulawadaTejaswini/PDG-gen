import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}
	
	
	static class Task{
		long M = (long) (1e18);
		
		public void solve(InputReader in, PrintWriter out) {
			String s = in.next();
			long res = s.length()*(s.length()-1)/2;
			int[] count = new int[28];
			for(char c : s.toCharArray()) 
				count[c-97] ++;
			for(int e: count) 
				res -= e*(e-1)/2;
			out.print(res+1);
			
		}//solve

		
		}//Task
	
	
	
	//InputReader
	static class InputReader{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		public String next() {
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
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
		public float nextFloat() {
			return Float.parseFloat(next());
		}
		
	}
}
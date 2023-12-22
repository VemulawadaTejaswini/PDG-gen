import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		int M = (int) (1e9+7);
		
		
		
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt(), day = in.nextInt();
			job[] pp = new job[n];
			for(int i = -1; ++i < n;) 
				pp[i] = new job(day-in.nextInt(),in.nextInt());
			Arrays.sort(pp);
			//for(job jj: pp) out.println(jj.f + " " +jj.s);
			int[] used = new int[day];
			Arrays.fill(used, 0);
			int res = 0;
			for(job j: pp) {
				int daydo = j.f;
				while(daydo>-1&&used[daydo]!=0) {
					daydo-=used[daydo];
					
				}
				if(daydo>-1) {
					res+=j.s;
					used[daydo]++;
				}
			}
			out.print(res);
		}//solve

		

		
		}//Task
/*
5
4 5
2 1
3 2
2 5

*/				
	
		
		
	
	static class job implements Comparable<job>{
		int f,s;

		public job(int f, int s) {
			this.f = f;
			this.s = s;
		}
		
		@Override
		public int compareTo(job o) {
			return (o.s!=s?o.s - s:f-o.f);
		}
		
	}
		
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
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		long n=input.nextLong();
		long a=input.nextLong();
		long b=input.nextLong();
		long out=(long)0;
		while (n!=0) {
			if(n>a) {
				n-=a;
				out+=a;
			}else {
				out+=n;
				n=0;
			}
			if(n>b)n-=b;
			else n=0;
		}
		pw.print(out);
		pw.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}

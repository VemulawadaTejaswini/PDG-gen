import java.io.*;
import java.util.*;
​
public class Main {
​
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double[] arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]= (sc.nextDouble()+1)/2;
		}
		double max=0;
		double sum=0;
		for(int i=0;i<n-k+1;i++) {
			for(int j=i;j<k+i;j++) {
				sum=sum+arr[j];
			}
			if(sum>max) {
				max=sum;}
			sum=0;
		}
		pw.println(max);
		pw.close();
	}
​
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
​
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
​
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}
​
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
​
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
​
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
​
		public String nextLine() throws IOException {
			return br.readLine();
		}
​
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
​
		public boolean ready() throws IOException {
			return br.ready();
		}
​
	}
}

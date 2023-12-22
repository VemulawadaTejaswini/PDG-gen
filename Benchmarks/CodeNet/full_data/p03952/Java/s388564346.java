import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n=sc.nextInt();
		int x = sc.nextInt();
		if(x==1||x==2*n-1) {
			System.out.println("No");
			return;
		}
		Queue<Integer> q=new ArrayDeque<>();
		for(int i=2; i<=2*n-1;i++) {
			if(i!=x+1&&i!=x)
				q.add(i);
		}
		for(int i=0; i<n-3; i++) {
			int e=q.poll();
			System.out.println(e);
		}
		System.out.println(x+1);
		System.out.println(1);
		System.out.println(x);
		System.out.println(2*n-1);
		for(int i=0; i<n-2; i++) {
			System.out.println(q.poll());
		}
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s) 
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}

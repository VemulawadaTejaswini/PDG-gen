import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() * 4;
		int b = sc.nextInt() * 2;
		int c = sc.nextInt() * 1;
		int two = sc.nextInt();
		int wanted = sc.nextInt();
		int single = Math.min(a, Math.min(b, c));
		if(single * 2 < two)
		{
			System.out.println(wanted*1l*single);
		}
		else
		{
			long ans = 1l*(wanted/2) * two + 1l*single * (wanted%2);
			System.out.println(ans);
		}
		
		
	}
	static class Scanner{
		StringTokenizer st;BufferedReader br;
		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}
		public String next() throws IOException 
		{while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());return st.nextToken();}
		public int nextInt() throws IOException {return Integer.parseInt(next());}
		public long nextLong() throws IOException {return Long.parseLong(next());}
		public String nextLine() throws IOException {return br.readLine();}
		public double nextDouble() throws IOException {return Double.parseDouble(next());}
		public boolean ready() throws IOException {return br.ready();}
	}
}

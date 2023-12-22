import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[][] map = new char[100][99];
		for(int i=0; i<100; i++) {
			Arrays.fill(map[i], '.');
		}
		fillA(map, a);
		fillB(map, b);
		PrintWriter pw = new PrintWriter(System.out);
		for(int i=0; i<100; i++) {
			for(int j=0; j<99; j++) {
				pw.print(map[i][j]);
			}
			pw.println();
		}
		pw.close();
	}
	
	static void fillA(char[][] map, int a) {
		for(int i=0; i<100; i+=3) {
			for(int j=0; j<99; j+=3) {
				if(a-1>0) {
					fillBlock(map, i, j);
					a--;
				} else if(a-1==0) {
					return;
				} else {
					assert false;
				}
			}
		}
	}
	
	static void fillBlock(char[][] map, int i, int j) {
		for(int ii=i; ii<i+3; ii++) {
			for(int jj=j; jj<j+3; jj++) {
				map[ii][jj] = '#';
			}
		}
		map[i+1][j+1]='.';
	}
	
	static void fillB(char[][] map, int b) {
		for(int i=99; i>=50; i-=2) {
			for(int j=0; j<99; j++) {
				if(b-1>0) {
					if(j%2==0) {
						map[i][j] = '#';
						b--;
					}
				} else if(b-1==0) {
					return;
				} else {
					assert false;
				}
			}
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
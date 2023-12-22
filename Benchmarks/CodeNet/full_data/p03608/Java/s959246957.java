/**
 * DA-IICT
 * Author : PARTH PATEL
 */
import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.fill;
import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;


public class Main {

	public static int mod = 1000000007;
	static FasterScanner in = new FasterScanner();
	static PrintWriter out = new PrintWriter(System.out);
	public static void dfs(int level,int vertex,int dist)
	{
		if(level==r+1)
		{
			answer=Math.min(answer, dist);
			return;
		}
		for(int i=1;i<=r;i++)
		{
			if(!visited[i])
			{
				visited[i]=true;
				if(vertex==-1)
				{
					dfs(level+1, i, 0);
				}
				else
				{
					dfs(level+1, i, dist+distance[arr[vertex]][arr[i]]);
				}
				visited[i]=false;
			}
		}
	}
	static int n,m,r;
	static int[] arr;
	static int[][] adjacencymatrix;
	static int[][] distance;
	static boolean[] visited;
	static int answer=Integer.MAX_VALUE;
	public static void main(String[] args) {

		 n=in.nextInt();
		 m=in.nextInt();
		 r=in.nextInt();
		 arr=new int[r+1];
		 for(int i=1;i<=r;i++)
		 {
			 arr[i]=in.nextInt();
		 }
		 adjacencymatrix=new int[n+1][n+1];
		 distance=new int[n+1][n+1];
		 visited=new boolean[r+1];
		for(int i=0;i<m;i++)
		{
			int u=in.nextInt();
			int v=in.nextInt();
			int c=in.nextInt();
			adjacencymatrix[u][v]=c;
			adjacencymatrix[v][u]=c;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
					distance[i][j]=0;
				else
					if(adjacencymatrix[i][j]!=0)
						distance[i][j]=adjacencymatrix[i][j];
					else
						distance[i][j]=Integer.MAX_VALUE;
			}
		}
		for(int k=1;k<=n;k++)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					distance[i][j]=Math.min(distance[i][j], distance[i][k]+distance[k][j]);
				}
			}
		}
		dfs(1, -1, 0);
		out.println(answer);
		
		out.close();

	}

	public static long pow(long x, long n, long mod) {
		long res = 1;
		for (long p = x; n > 0; n >>= 1, p = (p * p) % mod) {
			if ((n & 1) != 0) {
				res = (res * p % mod);
			}
		}
		return res;
	}

	public static long gcd(long n1, long n2) {
		long r;
		while (n2 != 0) {
			r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		return n1;
	}

	static class FasterScanner {
		private byte[] buf = new byte[1024];
		private int curChar;
		private int snumChars;

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = System.in.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}

}

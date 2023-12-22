import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, HashSet<Integer>> es = new HashMap<>();
		boolean[] selfloop = new boolean[n+1];
		char[] s = new char[n+1];
		String str = sc.next();
		for(int i=1; i<=n; i++) es.put(i, new HashSet<>());
		for(int i=1; i<=n; i++) s[i] = str.charAt(i-1);
		for(int _i=0; _i<m; _i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			es.get(a).add(b);
			es.get(b).add(a);
		}
		for(int i=1; i<=n; i++) {
			if(es.get(i).contains(i)) {
				selfloop[i] = true;
			} else selfloop[i] = false;
		}
		// case 1
		for(int i=1; i<=n; i++) {
			if(s[i]=='A') {
				if(!selfloop[i]) continue;
				for(int b : es.get(i)) {
					if(s[b]=='B'&&selfloop[b]) {
						System.out.println("Yes");
						return;
					}
				}
			} else { // s[i] == 'B'
				if(!selfloop[i]) continue;
				for(int b : es.get(i)) {
					if(s[b]=='A'&&selfloop[b]) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		// case 2
		for(int i=1; i<=n; i++) {
			if(s[i]=='A') {
				for(int a : es.get(i)) {
					if(s[a]=='A') {
						for(int b1 : es.get(i)) {
							for(int b2 : es.get(a)) {
								if(s[b1]=='B'&&s[b2]=='B') {
									if(es.get(b1).contains(b2)) {
										System.out.println("Yes");
										return;
									}
								}
							}
						}
					}
				}
			}
		}
		// case 3 ... ?
		for(int a1=1; a1<=n; a1++) {
			if(s[a1]=='A') {
				for(int a2 : es.get(a1)) {
					if(s[a2]=='A') {
						// check a1
						boolean f1 = false;
						for(int b1 : es.get(a1)) {
							for(int b2 : es.get(a1)) {
								if(s[b1]=='B'&&s[b2]=='B'&&es.get(b1).contains(b2)) {
									f1 = true;
								}
							}
						}
						for(int b1 : es.get(a1)) {
							if(s[b1]=='B'&&selfloop[b1]) f1 = true;
						}
						boolean f2 = false;
						for(int b1 : es.get(a2)) {
							for(int b2 : es.get(a2)) {
								if(s[b1]=='B'&&s[b2]=='B'&&es.get(b1).contains(b2)) {
									f2 = true;
								}
							}
						}
						for(int b1 : es.get(a2)) {
							if(s[b1]=='B'&&selfloop[b1]) f2 = true;
						}
						if(f1&&f2) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		for(int b1=1; b1<=n; b1++) {
			if(s[b1]=='B') {
				for(int b2 : es.get(b1)) {
					if(s[b2]=='B') {
						// check b1
						boolean f1 = false;
						for(int a1 : es.get(b1)) {
							for(int a2 : es.get(b1)) {
								if(s[a1]=='A'&&s[a2]=='A'&&es.get(a1).contains(a2)) {
									f1 = true;
								}
							}
						}
						for(int a1 : es.get(b1)) {
							if(s[a1]=='A'&&selfloop[a1]) f1 = true;
						}
						boolean f2 = false;
						for(int a1 : es.get(b2)) {
							for(int a2 : es.get(b2)) {
								if(s[a1]=='A'&&s[a2]=='A'&&es.get(a1).contains(a2)) {
									f2 = true;
								}
							}
						}
						for(int a1 : es.get(b2)) {
							if(s[a1]=='A'&&selfloop[a1]) f2 = true;
						}
						if(f1&&f2) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
 	}
	
	static void printArray(int[] a) {
		int n=a.length;
		for(int i=0; i<n; i++) {
			if(i==0) System.out.print(a[i]);
			else System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	
	static class Pair {
		int fst;
		int snd;
		public Pair(int a, int b) {
			fst = a;
			snd = b;
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

import java.util.*;

import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] adL, adH;
	static int n, q;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		String s=sc.nextLine();
		q = sc.nextInt();
		TreeSet<Integer> []a=new TreeSet[26];
		for(int i=0;i<26;i++)
			a[i]=new TreeSet<>();
		for(int i=0;i<s.length();i++)
			a[s.charAt(i)-'a'].add(i);
		for(int i=0;i<q;i++) {
			if(sc.nextInt()==1) {
				int d=sc.nextInt()-1;
				int g=sc.nextChar()-'a';
				 for(int j=0;j<26;j++)
					 if(a[j].contains(d)) {
						 a[j].remove(d);
						 break;
					 }
				 a[g].add(d);
			}
			else {
			 int ans=0;
			 int l=sc.nextInt()-1;
			 int r=sc.nextInt();
			 for(int j=0;j<26;j++)
				 if(!a[j].subSet(l, r).isEmpty())
					 ans++;
			 out.println(ans);
			}
		}
		out.flush();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
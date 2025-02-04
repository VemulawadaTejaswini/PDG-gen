import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		int INF=1000000007;
		SC sc=new SC(System.in);
		int V=sc.nextInt();
		ArrayList<ArrayList<Integer>> v=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=V; i++) {
			v.add(new ArrayList<Integer>());
		}
		for(int i=0; i<V-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			(v.get(a)).add(b);
			(v.get(b)).add(a);
		}
		int[] Fe=new int[V+1];
		int[] Su=new int[V+1];
		boolean[] Fe_V=new boolean[V+1];
		boolean[] Su_V=new boolean[V+1];
		Arrays.fill(Fe, INF);
		Arrays.fill(Su, INF);
		Fe[1]=0;
		Su[V]=0;
		Stack<Integer> Q=new Stack<Integer>();
		Q.add(1);
		while(!Q.isEmpty()) {
			int tmp=Q.pop();
			for(int i=0; i<v.get(tmp).size(); i++) {
				if(!Fe_V[v.get(tmp).get(i)] && Fe[tmp]+1<Fe[v.get(tmp).get(i)]) {
					Fe_V[v.get(tmp).get(i)]=true;
					Fe[v.get(tmp).get(i)]=Fe[tmp]+1;
					Q.push(v.get(tmp).get(i));
				}
			}
		}

		Q.add(V);
		while(!Q.isEmpty()) {
			int tmp=Q.pop();
			for(int i=0; i<v.get(tmp).size(); i++) {
				if(!Su_V[v.get(tmp).get(i)] && Su[tmp]+1<Su[v.get(tmp).get(i)]) {
					Su_V[v.get(tmp).get(i)]=true;
					Su[v.get(tmp).get(i)]=Su[tmp]+1;
					Q.push(v.get(tmp).get(i));
				}
			}
		}
		int Su_w=0;
		int Fe_w=0;
		for(int i=1; i<=V; i++) {
			if(Fe[i]<=Su[i]) {
				Fe_w++;
			}
			else {
				Su_w++;
			}
		}
		if(Su_w>=Fe_w) {
			System.out.println("Snuke");
			System.out.flush();
		}
		else {
			System.out.println("Fennec");
			System.out.flush();
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
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
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}
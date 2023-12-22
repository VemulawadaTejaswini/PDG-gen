
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		allpermutation=new ArrayList<String>();
		visited= new boolean[n+1];
		recur(1, new StringBuilder(), n);
		StringBuilder first = new StringBuilder();
		for(int i=0;i<n;i++) {
			first.append(s.nextInt());
		}
		int a = find(first.toString());
		StringBuilder second= new StringBuilder();
		for(int i=0;i<n;i++) {
			second.append(s.nextInt());
		}
		int b= find(second.toString());
		out.println(Math.abs(b-a));
	}
	
	public static int find(String str) {
		for(int i=0;i<allpermutation.size();i++) {
			String current = allpermutation.get(i);
			if(current.equals(str)) {
				return i;
			}
		}
		return -1;
	}

	public static ArrayList<String> allpermutation;
	public static boolean[] visited;
	
	public static void recur(int pos,StringBuilder str,int n) {
		if(pos>n) {
			allpermutation.add(str.toString());
			return;
		}
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				visited[i]=true;
				StringBuilder temp = new StringBuilder(str);
				temp.append(i);
				recur(pos+1, temp, n);
				visited[i]=false;
			}
		}
	}
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}

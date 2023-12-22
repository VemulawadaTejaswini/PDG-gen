import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		double[] fact = new double[9];
		fact[1]=1;
		for(int i=2;i<=8;i++) {
			fact[i]=fact[i-1]*i;
		}
		int n=s.nextInt();
		x=new double[n];
		y = new double[n];
		visited=new boolean[n];
		for(int i = 0;i<n;i++) {
			x[i]=s.nextDouble();
			y[i]=s.nextDouble();
		}
		for(int i=0;i<n;i++) {
			visited[i]=true;
			Possible_Paths(x[i], y[i], 1, 0.0);
			visited[i]=false;
		}
		out.println(sum/fact[n]);
	}
	
	public static double sum = 0;
	public static double[] x;
	public static double[] y;
	public static boolean[] visited;
	
	
	public static void Possible_Paths(double curr_x,double curr_y,int used,double distance) {
		int n = x.length;
		if(used == n-1) {
			double n_x=0 ,n_y=0;
			for(int i=0;i<n;i++) {
				if(!visited[i]) {
					n_x = x[i];
					n_y = y[i];
				}
			}
			double temp = Math.sqrt((curr_x-n_x)*(curr_x-n_x) + (curr_y-n_y) * (curr_y-n_y));
			sum += distance+temp;
			return;
		}
		double n_x=0 ,n_y=0;
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				n_x = x[i];
				n_y = y[i];
				visited[i]=true;
				double temp = Math.sqrt((curr_x-n_x)*(curr_x-n_x) + (curr_y-n_y) * (curr_y-n_y));
				Possible_Paths(n_x,n_y,used+1,distance+temp);
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

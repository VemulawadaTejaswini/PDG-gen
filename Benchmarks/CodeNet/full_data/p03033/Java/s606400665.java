import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	String fileName = "input.txt";
	final boolean isDebug = false;
	//final boolean isDebug = true;
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	final int MOD = (int)1e9+7;
	final long INF = Long.MAX_VALUE / 2;
	//final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int N = in.nextInt();
		int Q = in.nextInt();
		State[] list = new State[2*N];
		for(int i = 0; i < N; i++){
			int s = in.nextInt(), t = in.nextInt();
			int x = in.nextInt();
			list[2*i] = new State(true, s-x, x);
			list[2*i+1] = new State(false, t-x, x);
		}
		
		int[] D = new int[Q];
		for(int i = 0; i < Q; i++) D[i] = in.nextInt();
		
		Arrays.sort(list, (e1, e2)->Integer.compare(e1.t, e2.t));
		int[] x = new int[Q];
		Arrays.fill(x, Integer.MAX_VALUE);
		int indexD = 0;
		TreeSet<Integer> set = new TreeSet<>();
		for(State s : list){
			int minX = set.isEmpty() ? Integer.MAX_VALUE : set.first();
			while(indexD < D.length && s.t > D[indexD]){
				x[indexD] = minX;
				indexD++;
			}
			if(s.isStart) set.add(s.X);
			else set.remove(s.X);
		}
		
		for(int e : x) out.println((e == Integer.MAX_VALUE) ? -1 : e);
	}
	
	class State{
		boolean isStart;
		int t, X;
		public State(boolean b, int t, int x){
			this.isStart = b; this.t = t; this.X = x;
		}
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		if(isDebug) in = new FastScanner(new FileInputStream(fileName));
		solve();
		out.flush();
	}
	/* end main */
}
/* end Main */

class FastScanner {
	Reader input;

	FastScanner() {
		this(System.in);
	}

	FastScanner(InputStream stream) {
		this.input = new BufferedReader(new InputStreamReader(stream));
	}

	int nextInt() {
		return (int) nextLong();
	}

	long nextLong() {
		try {
			int sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			long ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) return ret * sign;
				ret *= 10;
				ret += b - '0';
			}
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}

	double nextDouble() {
		try {
			double sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			double ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) break;
				ret *= 10;
				ret += b - '0';
			}
			if (b != '.') return sign * ret;
			double div = 1;
			b = input.read();
			while ('0' <= b && b <= '9') {
				ret *= 10;
				ret += b - '0';
				div *= 10;
				b = input.read();
			}
			return sign * ret / div;
		} catch (IOException e) {
			e.printStackTrace();
			return Double.NaN;
		}
	}

	char nextChar() {
		try {
			int b = input.read();
			while (Character.isWhitespace(b)) {
				b = input.read();
			}
			return (char) b;
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	String nextStr() {
		try {
			StringBuilder sb = new StringBuilder();
			int b = input.read();
			while (Character.isWhitespace(b)) {
				b = input.read();
			}
			while (b != -1 && !Character.isWhitespace(b)) {
				sb.append((char) b);
				b = input.read();
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
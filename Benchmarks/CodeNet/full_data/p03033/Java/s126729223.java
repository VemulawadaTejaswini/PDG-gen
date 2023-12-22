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
		Pair[] list = new Pair[N];
		for(int i = 0; i < N; i++){
			int s = in.nextInt(), t = in.nextInt()-1;
			int x = in.nextInt();
			list[i] = new Pair(s, t, x);
		}
		
		TreeSet<Integer> set = new TreeSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] D = new int[Q];
		for(int i = 0; i < Q; i++){
			D[i] = in.nextInt();
			set.add(D[i]);
			map.put(D[i], i);
		}
		
		Arrays.sort(list, (e1, e2)->Integer.compare(e1.X, e2.X));
		int[] x = new int[Q];
		Arrays.fill(x, Integer.MAX_VALUE);
		for(Pair p : list){
			Integer dL = set.ceiling(p.S - p.X);
			Integer dR = set.floor(p.T - p.X);
			if(dL == null || dR == null) continue;
			do{
				if(dL > dR) break;
				if(dL == dR){
					x[map.get((int)dR)] = p.X;
					set.remove(dR);
					break;
				}else{
					x[map.get((int)dR)] = p.X;
					set.remove(dR);
					dR = set.floor(p.T - p.X);
				}
			}while(true);
		}
		
		for(int e : x) out.println((e == Integer.MAX_VALUE) ? -1 : e);
	}
	
	class Pair{
		int S, T;
		int X;
		public Pair(int s, int t, int x){
			S = s; T = t; X = x;
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
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	final int MOD = (int)1e9+7;
	void printlnYN(boolean b){out.println((b ? "YES" : "NO"));}

	//System.out.println();はつかわない！！
	void solve() throws Exception{
		String S = in.nextStr(), T = in.nextStr();
		
		boolean[] isAll = new boolean[2];
		Arrays.fill(isAll, true);
		for(int i = 0; i < S.length()-1; i++){
			if(S.charAt(i) != S.charAt(i+1)){
				isAll[0] = false;
				break;
			}
		}
		for(int i = 0; i < T.length()-1; i++){
			if(T.charAt(i) != T.charAt(i+1)){
				isAll[1] = false;
				break;
			}
		}
		
		if((isAll[0] && isAll[1] && S.charAt(0) == T.charAt(0))){
			out.println("-1");
			return;
		}
		
		if(S.length() <= T.length()){
			String s1 = new String(S), t1 = new String(T);
			while(s1.length() < t1.length()) s1 += s1;
			if(t1.equals(s1.substring(0, t1.length()))){
				out.println("-1");
				return;
			}
		}
		
		int ans = 0;
		boolean isOk = false;
		int index = 0;
		int len = 0, cnt = 0;
		S += S;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < S.length(); i++){
			if(i >= S.length()) break;
			if(S.charAt(i) == T.charAt(index)){
				index++;
				if(index == T.length()){
					cnt++;
					index = 0;
				}
			}else{
				ans = Math.max(ans, cnt);
				cnt = 0;
				index = 0;
			}
		}
		out.println(ans);
	}
	
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		solve();
		out.flush();
	}
	
	class FastScanner {
		Reader input;

		FastScanner() {this(System.in);}
		FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
		
		int nextInt() {return (int) nextLong();}

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
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}
 
		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}
 
		public int[] nextIntArray1Index(int n) {
			int[] res = new int[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextInt();
			}
			return res;
		}
 
		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}
 
		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}
 
		public long[] nextLongArray1Index(int n) {
			long[] res = new long[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextLong();
			}
			return res;
		}
 
		public double[] nextDoubleArray(int n) {
			double[] res = new double[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextDouble();
			}
			return res;
		}
	}
}
/* end Main */
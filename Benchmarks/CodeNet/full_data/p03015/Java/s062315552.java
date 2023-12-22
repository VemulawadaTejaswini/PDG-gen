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
	
	//System.out.println();はつかわない！！
	void solve() throws Exception{
		String L = in.nextStr();
		long[][] dp = new long[L.length()+1][2];
		dp[0][0] = 1;
		
		for(int i = 0; i < L.length(); i++){
			int d = Integer.valueOf(L.charAt(i) - '0');
			for(int j = 0; j <= 1; j++){
				if(j == 0 && d == 0){
					dp[i+1][0] = (dp[i+1][0] + dp[i][0]) % MOD;
				}else if(j == 0 && d == 1){
					dp[i+1][0] = (dp[i+1][0] + (dp[i][0] * 2) % MOD) % MOD;
					dp[i+1][1] = (dp[i+1][1] + dp[i][0]) % MOD;
				}else if(j == 1 && d == 0){
					dp[i+1][1] = (dp[i+1][1] + (dp[i][1] * 3) % MOD) % MOD;
				}else if(j == 1 && d == 1){
					dp[i+1][1] = (dp[i+1][1] + (dp[i][1] * 3) % MOD) % MOD;
				}
			}
		}
		
		out.println((dp[L.length()][0] + dp[L.length()][1]) % MOD);
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
}
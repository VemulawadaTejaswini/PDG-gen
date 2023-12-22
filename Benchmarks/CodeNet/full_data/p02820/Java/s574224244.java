import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
	private final static char R = 'r';
	private final static char S = 's';
	private final static char P = 'p';
	
	private static long r = 0;
	private static long s = 0;
	private static long p = 0;
	
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = os.nextInt();
		int k = os.nextInt();
		
		r = os.nextLong();
		s = os.nextLong();
		p = os.nextLong();
		
		long sum = 0;
		String t = os.next();
		pw.println(t);
		char[] array = new char[t.length()];
		for (int i = 0; i < n; i++) {
			char opp = t.charAt(i);
			char win = getWin(opp);
			if (i >= k && array[i-k] == win) {
				int d = i + k;
				if (n > d) {
					char future = getWin(t.charAt(d));
					if (future == opp) array[i] = getLose(opp);
					else array[i] = opp;
				}
				else {
					array[i] = opp;
				}
			}
			else {
				array[i] = win;
				sum += getAdd(opp);
			}
		}
		pw.println(sum);
		pw.close();
	}

    private static char getWin(char g) {
		switch (g) {
			case R:
				return P;
			case S:
				return R;
			case P:
				return S;
		}
		return 0;
	}

    private static char getLose(char g) {
		switch (g) {
			case R:
				return S;
			case S:
				return P;
			case P:
				return R;
		}
		return 0;
	}
    
    private static long getAdd(char g) {
		switch (g) {
			case R:
				return p;
			case S:
				return r;
			case P:
				return s;
		}
		return 0;
	}
    
	static class OriginScanner {
		StringTokenizer token;
		BufferedReader br;
		
		public OriginScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String nextLine() {
			String str = null;
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			return str;
		}
		
		String next() {
			while (token == null || !token.hasMoreElements()) { 
				token = new StringTokenizer(nextLine());
			}
			return token.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String s = fs.next(), t = fs.next();
		int sl = s.length();
		int tl = t.length();
		TreeSet<String> ts = new TreeSet<>();
		for(int i=0;i<sl;i++) {
			if(i+tl>sl)break;
			boolean no = false;
			for(int j=0;j<tl;j++) {
				if(s.charAt(i+j)!='?'&&s.charAt(i+j)!=t.charAt(j)) {
					no = true;
					break;
				}
			}
			if(no)continue;
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<sl;j++) {
				if(j<i) {
					if(s.charAt(j)=='?')sb.append('a');
					else sb.append(s.charAt(j));
				}
				else if(j<i+tl)sb.append(t.charAt(j-i));
				else {
					if(s.charAt(j)=='?')sb.append('a');
					else sb.append(s.charAt(j));					
				}
			}
			ts.add(sb.toString());
		}
		if(ts.size()==0)System.out.println("UNRESTORABLE");
		else System.out.println(ts.pollFirst());
	}
}


//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
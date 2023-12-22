import java.util.*;
import java.io.*;
//tからsの参照方法を工夫してO(NlogN)まで高速化する。
//文字のポインタをMapを作ることでO(1)にするが、同じ文字を複数含むことがある。
//これはMapのValueをTreeSetで持たせることで、現在値から一番近い同文字のポインタをlogで得られる。
public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String s = fs.next() , t = fs.next();
		
		Map<Character, TreeSet<Integer> > map = new HashMap<>();
		int slen = s.length();
		for(int i=0;i<slen;i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				TreeSet<Integer> ts = new TreeSet<>();
				ts.add(i);
				map.put(c, ts);
			}
			else {
				map.get(c).add(i);
			}
		}
		
		int now = 0;
		long cnt = 0;
		int tlen = t.length();
		for(int i=0;i<tlen;i++) {
			char c = t.charAt(i);
			if(map.get(c)==null) {
				System.out.println(-1);
				return;
			}
			if(map.get(c).higher(now)==null) {
				cnt ++;
				now = map.get(c).first();
			}
			else {
				now = map.get(c).higher(now);
			}
		}
		long ans = cnt * slen + now + 1;
		System.out.println(ans);
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

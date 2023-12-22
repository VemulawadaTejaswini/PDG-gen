import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	int N,M;
	int[] X;
	TreeMap<Integer,HashMap<Integer,Integer>> s;

	public void solve() {
		N = nextInt();
		M = nextInt();

		X = new int[N];
		s = new TreeMap<Integer,HashMap<Integer,Integer>>();

		for(int i = 0;i < N;i++){
			X[i] = nextInt();
			int mod = X[i] % M;

			if(!s.containsKey(mod)){
				s.put(mod,new HashMap<Integer,Integer>());

			}
			s.get(mod).put(X[i], s.get(mod).containsKey(X[i]) ? s.get(mod).get(X[i]) + 1 : 1);
		}

		int ans = 0;

		for(int mod = 0;mod <= M / 2;mod++){
			int dom = (M - mod) % M;

			if(s.containsKey(mod) && s.containsKey(dom)){
				int S = 0;
				int T = 0;

				for(int key : s.get(mod).keySet()){
					S += s.get(mod).get(key);
				}

				for(int key : s.get(dom).keySet()){
					T += s.get(dom).get(key);
				}

				if(mod == dom){
					ans += S / 2;
				}else if(S < T){
					T -= S;
					for(int key : s.get(dom).keySet()){
						int cnt = s.get(dom).get(key);

						int min = Math.min(cnt, T);
						T -= min / 2 * 2;
						ans += min / 2;
					}
					ans += S;
				}else{
					S -= T;
					for(int key : s.get(mod).keySet()){
						int cnt = s.get(mod).get(key);

						int min = Math.min(cnt, S);
						S -= min / 2 * 2;
						ans += min / 2;
					}
					ans += T;
				}
			}else if(s.containsKey(mod)){
				for(int key : s.get(mod).keySet()){
					int cnt = s.get(mod).get(key);
					ans += cnt / 2;
				}
			}else if(s.containsKey(dom)){
				for(int key : s.get(dom).keySet()){
					int cnt = s.get(dom).get(key);
					ans += cnt / 2;
				}
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
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
}
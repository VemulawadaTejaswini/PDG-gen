import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	int R,C,N;
	int[] r,c,a;
	TreeMap<Integer,Integer>[] map;
	HashSet<Long> set;
	int[] dx = {1,0,1};
	int[] dy = {0,1,1};
	public void solve() {
		R = nextInt();
		C = nextInt();
		N = nextInt();
		r = new int[N];
		c = new int[N];
		a = new int[N];
		map = new TreeMap[R];
		set = new HashSet<Long>();
		for(int i = 0;i < R;i++){
			map[i] = new TreeMap<Integer,Integer>();
		}

		for(int i = 0;i < N;i++){
			r[i] = nextInt() - 1;
			c[i] = nextInt() - 1;
			a[i] = nextInt();
			map[r[i]].put(c[i], a[i]);
			set.add((long)r[i] * (long)1e6 + c[i]);
			if(r[i] + 1 >= R || c[i] + 1 >= C)continue;
			for(int j = 0;j < 3;j++){
				int nr = r[i] + dy[j];
				int nc = c[i] + dx[j];
				map[nr].put(nc, -1);
			}
		}

		for(int i = 0;i < R - 1;i++){
			for(int key : map[i].keySet()){
				if(!set.contains((long)i * (long)1e6 + key))continue;
				if(key == C - 1)continue;
				int a = map[i].get(key);
				int b = map[i].get(key + 1);
				int c = map[i + 1].get(key);
				int d = map[i + 1].get(key + 1);

				if(a != -1 && b != -1 && c != -1 && d != -1){
					if(a + d != b + c){
						out.println("No");
						return ;
					}
				}

				if(a != -1 && b != -1 && c != -1 && d == -1){
					if(c + b < a){
						out.println("No");
						return;
					}
					map[i + 1].put(key + 1,c + b - a);
				}else if(a != -1 && b != -1 && c == -1 && d != -1){
					if(a + d < b){
						out.println("No");
						return;
					}
					map[i + 1].put(key, a + d - b);
				}else if(a != -1 && b == -1 && c != -1 && d != -1){
					if(a + d < c){
						out.println("No");
						return;
					}
					map[i].put(key + 1, a + d - c);
				}else if(a == -1 && b != -1 && c != -1 && d != -1){
					if(b + c < d){
						out.println("No");
						return;
					}
					map[i].put(key, b + c - d);
				}else if(a != -1 && b == -1 && c == -1 && d != -1){
					out.println("No");
					return;
				}else if(a == -1 && b != -1 && c != -1 && d == -1){
					out.println("No");
					return;
				}
			}
		}
		out.println("Yes");
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
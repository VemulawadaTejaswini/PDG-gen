import java.util.*;
import java.io.*;

class Point{
	int x, y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point key = (Point)obj;
			return this.x == key.x && this.y == key.y;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(x,y);
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int h = fs.nextInt(), w = fs.nextInt(), n = fs.nextInt();
		Map<Point, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			for(int j=-1;j<=1;j++) {
				for(int k=-1;k<=1;k++) {
					if(1<=a+j&&a+j<h-1&&1<=b+k&&b+k<w-1) {
						Point p = new Point(a+j,b+k);
						map.put(p, map.getOrDefault(p, 0)+1);
					}
				}
			}
		}
		long total[] = new long[10];
		total[0] = ((long)h-2)*(w-2) - map.size();
		for(int v:map.values()) total[v]++;
		for(int i=0;i<10;i++) {
			System.out.println(total[i]);
		}
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
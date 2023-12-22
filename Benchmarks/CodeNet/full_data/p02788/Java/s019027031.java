import java.util.*;
import java.io.*;

class Mon{
	long x, h;
	long cnt;

	public Mon(long x, long h, long cnt) {
		super();
		this.x = x;
		this.h = h;
		this.cnt = cnt;
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		long d = fs.nextInt(), a = fs.nextInt();
		TreeSet<Mon> ts = new TreeSet<>((m1,m2)->m1.x - m2.x<0?-1:1);
		for(int i=0;i<n;i++) {
			int tx = fs.nextInt();//x
			int th = fs.nextInt();//h
			ts.add(new Mon(tx,th,0));
		}

		long ans = 0;
		PriorityQueue<Mon> pq = new PriorityQueue<>((m1,m2)->m1.x - m2.x<0?-1:1);
		pq.offer(ts.pollFirst());
		while(!ts.isEmpty()) {
			if(pq.isEmpty()) {
				Mon t = ts.pollFirst();
				t.cnt = ans;
				pq.add(t);
				continue;
			}
			Mon tm = pq.poll();
			tm.h -= a *(ans - tm.cnt);
			if(tm.h <= 0)continue;
			long t = (tm.h + a - 1) / a;
			ans += t;
			
			while(!ts.isEmpty()) {
				Mon nm = ts.pollFirst();
				if(nm.x>tm.x+2*d) {
					ts.add(nm);
					break;
				}
				nm.cnt = (ans - t);
				pq.add(nm);

			}
		}
		
		if(!pq.isEmpty()) {
			long max = 0;
			while(!pq.isEmpty()) {
				Mon now = pq.poll();
				now.h -= a * (ans - now.cnt);
				if(now.h>0) {
					long t = (now.h + a - 1)/a;
					max = Math.max(max, t);
				}
			}
			ans += max;
		}
		
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
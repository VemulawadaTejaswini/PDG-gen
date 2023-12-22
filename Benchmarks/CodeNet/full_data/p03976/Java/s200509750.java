import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	int N,K;
	int[] alpha;

	private class P implements Comparable<P>{
		int a,b;
		public P(int a,int b){
			this.a = a;
			this.b = b;
		}
		public int compareTo(P p){
			return p.b - this.b;
		}
	}

	public void solve() {
		N = nextInt();
		K = nextInt();
		alpha = new int[26];
		for(int i = 0;i < N;i++){
			alpha[next().charAt(0) - 'A']++;
		}

		PriorityQueue<P> pq = new PriorityQueue<P>();
		Queue<P> tmp = new ArrayDeque<P>();
		for(int i = 0;i < 26;i++)pq.add(new P(i,alpha[i]));
		int k = 0;
		int cnt = 0;
		int bit = 0;
		while(pq.size() > 0){
			P p = pq.poll();
			if(p.b == 0)continue;

			if(((bit >> p.a)&1) == 1){
				tmp.add(p);
				continue;
			}
			bit |= (1 << p.a);
			cnt++;
			if(cnt == K){
				k++;
				cnt = 0;
				bit = 0;
				while(tmp.size() > 0){
					pq.add(tmp.poll());
				}
			}
			pq.add(new P(p.a,p.b - 1));
		}

		out.println(k);
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
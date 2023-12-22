import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	int N;
	int[] A,B;
	PriorityQueue<P> pq;
	private class P implements Comparable<P>{
		int x,y;
		public P(int x,int y){
			this.x = x;
			this.y = y;
		}
		public int compareTo(P p){
			return p.x - this.x;
		}
	}
	public void solve() {
		N = nextInt();
		A = new int[N];
		B = new int[100000 + 1];
		for(int i = 0;i < N;i++){
			A[i] = nextInt();
			B[A[i]]++;
		}
		pq = new PriorityQueue<P>();
		for(int i = 0;i < 100000 + 1;i++){
			if(B[i] == 0)continue;
			P p = new P(B[i],i);
			pq.add(p);
		}
		while(pq.size() > 0){
			P p = pq.poll();
			if(p.x == 1){
				pq.add(p);
				break;
			}
			if(p.x >= 3){
				if(p.x % 2 == 0){
					p.x = 2;
				}else{
					p.x = 1;
				}
			}else if(p.x == 2){
				if(pq.size() > 0){
					P pp = pq.poll();
					pp.x -= 1;
					if(pp.x > 0){
						pq.add(pp);
					}
					p.x = 1;
				}
			}
			pq.add(p);
		}

		out.println(pq.size());
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
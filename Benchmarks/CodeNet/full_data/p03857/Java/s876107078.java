import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	int N,K,L;
	int[] P,Q,R,S;
	int[] uf1,uf2;

	public void init(){
		uf1 = new int[N];
		uf2 = new int[N];
		for(int i = 0;i < N;i++){
			uf1[i] = i;
			uf2[i] = i;
		}
	}

	public void unite1(int x,int y){

		x = root1(x);
		y = root1(y);

		if(x < y){
			uf1[y] = x;
		}else{
			uf1[x] = y;
		}
	}

	public int root1(int x){
		if(uf1[x] == x)return x;
		return uf1[x] = root1(uf1[x]);
	}


	public boolean same1(int x,int y){
		return root1(x) == root1(y);
	}

	public void unite2(int x,int y){

		x = root2(x);
		y = root2(y);

		if(x < y){
			uf2[y] = x;
		}else{
			uf2[x] = y;
		}
	}

	public int root2(int x){
		if(uf2[x] == x)return x;
		return uf2[x] = root2(uf2[x]);
	}


	public boolean same2(int x,int y){
		return root2(x) == root2(y);
	}


	public void solve() {
		N = nextInt();
		K = nextInt();
		L = nextInt();

		P = new int[K];
		Q = new int[K];
		R = new int[L];
		S = new int[L];

		init();

		for(int i = 0;i < K;i++){
			P[i] = nextInt() - 1;
			Q[i] = nextInt() - 1;

			unite1(P[i],Q[i]);
		}

		for(int i = 0;i < L;i++){
			R[i] = nextInt() - 1;
			S[i] = nextInt() - 1;

			unite2(R[i],S[i]);
		}

		HashMap<Long,Integer> map = new HashMap<Long,Integer>();

		for(int i = 0;i < N;i++){
			long key = root1(i) * (long)1e9 + root2(i);
			map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
		}

		for(int i = 0;i < N;i++){
			if(i != 0)out.print(" ");
			long key = root1(i) * (long)1e9 + root2(i);

			out.print(map.get(key));
		}

		out.println();

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
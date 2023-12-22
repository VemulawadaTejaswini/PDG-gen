import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	int N,M;
	int[] K;
	ArrayList<Integer>[] langs,L;
	boolean[] usedLang,usedN;
	int[] union;

	public void unite(int x,int y){

		x = root(x);
		y = root(y);

		if(x < y){
			union[y] = x;
		}else{
			union[x] = y;
		}

	}

	public boolean same(int x,int y){
		return root(x) == root(y);
	}

	public int root(int x){
		return union[x] == x ? x : root(union[x]);
	}

	public void dfs1(int lang,int preN){
		usedLang[lang] = true;
		for(int n : langs[lang]){
			if(usedN[n])continue;
			unite(preN,n);
			dfs2(n);
		}
	}

	public void dfs2(int n){
		usedN[n] = true;
		for(int l : L[n]){
			if(usedLang[l])continue;
			dfs1(l,n);
		}
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		M = nextInt();
		usedN = new boolean[N];
		usedLang = new boolean[M];
		union = new int[N];
		for(int i = 0;i < N;i++){
			union[i] = i;
		}

		K = new int[N];

		L = new ArrayList[N];
		for(int i = 0;i < N;i++){
			L[i] = new ArrayList<Integer>();
		}

		langs = new ArrayList[M];
		for(int i = 0;i < M;i++){
			langs[i] = new ArrayList<Integer>();
		}

		for(int i = 0;i < N;i++){
			K[i] = nextInt();
			for(int j = 0;j < K[i];j++){
				int l = nextInt();
				L[i].add(l - 1);
				langs[l - 1].add(i);
			}
		}

		dfs2(0);

		for(int i = 0;i < N;i++){
			if(union[i] != 0){
				out.println("NO");
				return;
			}
		}
		out.println("YES");
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
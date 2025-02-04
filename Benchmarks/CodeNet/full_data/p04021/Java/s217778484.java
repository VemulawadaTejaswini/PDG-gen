import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	int N;
	int[] A,B;
	HashMap<Integer,Integer> a,b;
    public void solve() {
		N = nextInt();
		A = new int[N];
		B = new int[N];
		a = new HashMap<Integer,Integer>();
		b = new HashMap<Integer,Integer>();
		
		for(int i = 0;i < N;i++){
			A[i] = nextInt();
			a.put(A[i],i);
			
			B[i] = A[i];
		}
		Arrays.sort(B);
		for(int i = 0;i < N;i++){
			b.put(B[i],i);
		}
		
		int ans = 0;
		for(int key : b.keySet()){
			
			int aIndex = a.get(key);
			int bIndex = b.get(key);
			
			if(Math.abs(bIndex - aIndex) % 2 == 1){
				ans++;
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
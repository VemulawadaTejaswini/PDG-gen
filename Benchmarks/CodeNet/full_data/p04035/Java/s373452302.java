import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
	int N,L;
	int[] a;
	public void solve() {
		N = nextInt();
		L = nextInt();
		
		a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = nextInt();
		}
		
		int front = -1;
		for(int i = 0;i < N - 1;i++){
			if(a[i] + a[i + 1] >= L){
				front = i;
				break;
			}
		}
		
		if(front == -1){
			out.println("Impossible");
			return;
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(front);
		for(int i = front - 1;i >= 0;i--){
			ans.add(i);
		}
		
		for(int i = front + 1;i < N - 1;i++){
			ans.add(i);
		}
		
		Collections.reverse(ans);
		out.println("Possible");
		for(int i : ans){
			out.println(i + 1);
		}
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
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
 
import java.util.*;
 
public class Main {
	int H,W,N;
	int[] a,b;
	long[] cnt;
	HashSet<Long> color,used;
 
	public void solve() {
		H = nextInt();
		W = nextInt();
		N = nextInt();
 
		color = new HashSet<Long>();
 
		a = new int[N];
		b = new int[N];
		cnt = new long[10];
		cnt[0] = (long)(H - 2)* (W - 2);
		for(int i = 0;i < N;i++){
			a[i] = nextInt();
			b[i] = nextInt();
			color.add(a[i] * (long)1e9 + b[i]);
		}
		
		used = new HashSet<Long>();
		
		for(int i = 0;i < N;i++){
			
			for(int py = -2;py <=0;py++){
				for(int px = -2;px <=0;px++){
					int j = 0;
					boolean f = false;
					if(a[i] + py <= 0 || b[i] + px <= 0 || a[i] + py > H || b[i] + px > W)continue;
					if(used.contains((a[i] + py) * (long)1e9 + (b[i] + px)))continue;
					used.add((a[i] + py) * (long)1e9 + (b[i] + px));
					for(int y = 0;y < 3;y++){
						for(int x = 0;x < 3;x++){
							int ny = a[i] + py + y;
							int nx = b[i] + px + x;
							
							if(ny > H || nx > W || ny <= 0 || nx <= 0){
								f = true;
								break;
							}
						}
						if(f)break;
					}
					if(f)continue;
					for(int y = 0;y < 3;y++){
						for(int x = 0;x < 3;x++){
							
							int ny = a[i] + py + y;
							int nx = b[i] + px + x;
							if(color.contains(ny * (long)1e9 + nx)){
								j++;
							}
						}
					}
					cnt[j]++;
				}
			}
		}
		for(int i = 1;i <= 9;i++){
			cnt[0] -= cnt[i];
		}
 
		for(int i = 0;i < 10;i++){
			out.println(cnt[i]);
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
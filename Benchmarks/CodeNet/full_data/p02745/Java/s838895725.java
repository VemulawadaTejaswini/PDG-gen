import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		char pa[] = fs.next().toCharArray();
		char pb[] = fs.next().toCharArray();
		char pc[] = fs.next().toCharArray();
		int ans = INF;
		//a-b-cの順番
		
		for(int k=0;k<6;k++) {
			char a[] = null, b[] = null, c[] = null;
			if(k==0) {
				a = pa.clone();
				b = pb.clone();
				c = pc.clone();
			}
			if(k==1) {
				a = pa.clone();
				c = pb.clone();
				b = pc.clone();
			}
			if(k==2) {
				b = pa.clone();
				a = pb.clone();
				c = pc.clone();				
			}
			if(k==3) {
				b = pa.clone();
				c = pb.clone();
				a = pc.clone();				
			}
			if(k==4) {
				c = pa.clone();
				a = pb.clone();
				b = pc.clone();				
			}
			if(k==5) {
				c = pa.clone();
				b = pb.clone();
				a = pc.clone();				
			}
		
		
		
		
		String t = "";
		for(int i=0;i<a.length;i++) {
			boolean ok = true;
			int memo = -1;
			for(int j=0;j<b.length;j++) {
				if(i + j >=a.length) {
					memo = j;
					break;
				}
				if(b[j]!='?'&&a[i+j]!='?'&&b[j]!=a[i + j]) {
					ok = false;
					break;
				}
			}
			if(!ok)continue;
			//if(b.length<=a.length - memo) t = String.valueOf(a);
			if(memo==-1) {
				for(int j=i;j<a.length;j++) {
					if(0<=j&&j<b.length) {
						if(a[j]=='?')a[j] = b[j-i];
					}
				}
				t = String.valueOf(a);
			}
			else {
				for(int j=0;j<i;j++) {
					t += a[j];
				}
				for(int j=0;j<b.length;j++) {
					if(b[j]=='?'&&i+j<a.length) {
						t += a[j];
					}
					else t += b[j];
				}				
			}
			break;
		}
		if(t.length()==0) t = String.valueOf(a) + String.valueOf(b);
		// tとcの結合
		char ct[] = t.toCharArray();
		t = "";
		for(int i=0;i<ct.length;i++) {
			boolean ok = true;
			int memo = -1;
			for(int j=0;j<c.length;j++) {
				if(i + j >=ct.length) {
					memo = j;
					break;
				}
				if(c[j]!='?'&&ct[i+j]!='?'&&c[j]!=ct[i + j]) {
					ok = false;
					break;
				}
			}
			if(!ok)continue;
			//if(c.length<=ct.length - i - memo) t = String.valueOf(ct);
			if(memo==-1) {
				for(int j=i;j<ct.length;j++) {
					if(0<=j&&j<c.length) {
						if(ct[j]=='?')ct[j] = c[j-i];
					}
				}
				t = String.valueOf(ct);
			}
			else {
				for(int j=0;j<i;j++) {
					t += ct[j];
				}
				for(int j=0;j<c.length;j++) {
					if(c[j]=='?'&&i+j<ct.length) {
						t += ct[j];
					}
					else t += c[j];
				}				
			}
			break;
		}
		if(t.length()==0) {
			t = String.valueOf(ct) + String.valueOf(c);
		}
		
		ans = Math.min(ans,t.length());
		}
		System.out.println(ans);
		
	}

	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
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
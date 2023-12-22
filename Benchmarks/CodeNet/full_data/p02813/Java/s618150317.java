import java.util.*;
import java.io.*;
import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	static List<String> l;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int p[] = fs.nextIntArray(n);
		int q[] = fs.nextIntArray(n);
		
		String sp = "", sq = "";
		for(int i=0;i<n;i++) {
			sp += p[i];
			sq += q[i];
		}
		
		if(sp.equals(sq)) {
			System.out.println(0);
			return;
		}
		
		//1~nの順列を作る
		String s = "";
		for(int i=1;i<=n;i++) {
			s += i;
		}
		String ans = "";
		l = new ArrayList<String>();
		permutation(s, ans);
		int a = 0;
		int b = 0;
		boolean bb = false;
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals(sp)||l.get(i).equals(sq)) {
				if(bb == false) {
					a = i+1;
					bb = true;
				}else {
					b = i+1;
				}
			}
		}
		int res = b - a;
		System.out.println(res);
		
	}
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
           l.add(ans + q);
        	// System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
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
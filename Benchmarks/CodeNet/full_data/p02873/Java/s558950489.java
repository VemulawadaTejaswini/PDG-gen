import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		String S = next();
		char[] C = S.toCharArray();
		int N = C.length;
		// < = 60 , > = 62 ASCII
		List<Integer> zeros = new ArrayList<>();
		int[]a = new int[N+1];
		Arrays.fill(a,-1);
		if(C[0] == '<') {
			a[0] = 0;
			zeros.add(0);
		}
		for(int i=1;i<N;i++) {
			if(C[i-1] == '>' && C[i] == '<') {
				a[i] = 0;
				zeros.add(i);
			}
		}
		if(C[N-1] == '>') {
			a[N] = 0;
			zeros.add(N);
		}

		for(Integer zero:zeros) {

			for(int i=zero;i>0;i--) {
				if(a[i-1]==0)continue;
				if(C[i-1] == '>') {
					a[i-1] = a[i]+1;
				}else {
					break;
				}
			}
		}
		for(Integer zero:zeros) {
			for(int i=zero;i<N;i++) {
				if(a[i+1]==0)continue;
				if(C[i] == '<') {
					a[i+1] = a[i]+1;
				}else {
					break;
				}
			}
		}
		for(int i=1;i<N;i++) {
			if(C[i-1] == '<'&&C[i] == '>') {
				a[i] = Math.max(a[i-1], a[i+1])+1;
			}
		}

		long sum = 0;
		for(int num:a) {
			//out.print(num);
			sum += num;
		}
		out.println(sum);

	}
	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	private final Scanner sc;
	private final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;
		this.out = out;
		this.err = err;
	}

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int[] a = new int[M];
		final int[] b = new int[M];
		final int[] c = new int[M];
		final int[][] index = new int[N+1][M];
		final int[] indexTail = new int[N+1];
		final int terminate = (-1 << (32-N));
		for(int i=0;i<M;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			for(int j=0;j<b[i];j++) {
				int cij = sc.nextInt();
				c[i] |= 1 << (32 - cij);
				index[cij][indexTail[cij]]=i;
				indexTail[cij]++;
			}
		}
		final long result = calc(1, N, 0, terminate, a, b, c, index, indexTail);
		out.println(result);
	}
	private static long calc(int n, int N, int flags, int terminate, int[] a, int[] b, int[] c, int[][] index, int[] indexTail) {
		if(n > N) {
			return -1;
		}
		long value = Long.MAX_VALUE;
		for(int i=0;i<indexTail[n];i++) {
			final int idx = index[n][i];
			final int nextFlag = flags | c[idx];
			final int nextN = find(nextFlag);
			if(nextFlag == terminate) {
				value = Math.min(value, a[idx]);
			}else {
				final long subValue = calc(nextN, N, nextFlag, terminate, a, b, c, index, indexTail);
				if(subValue == -1) {
					continue;
				}
				value = Math.min(value, a[idx]+subValue);
			}
		}
		if(value == Long.MAX_VALUE) {
			return -1;
		}
		return value;
	}
	static private int find(int flag) {
		for(int i=1;i<=12;i++) {
			if(flag << i >= 0) {
				return i+1;
			}
		}
		return 13;
	}
}

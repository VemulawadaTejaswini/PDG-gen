import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int Q = sc.nextInt();
		final int cnt[] = new int[N+1];
		final long link[] = new long[N*2-2];
		final int index[] = new int[N+2];
		final int val[] = new int[N+1];
		for(int i=0;i<N-1;i++) {
			final long a = sc.nextLong();
			final long b = sc.nextLong();
			link[i] =( a << 32 | b );
			link[i+(N-1)] =( b << 32 | a );
		}
		Arrays.sort(link);
		int head = 0;
		for(int i=0;i<link.length;i++) {
			final int src = (int)(link[i]>>32);
			if(src!=head) {
				head = src;
				index[head]=i;
			}
		}
		index[N+1]=link.length;
//		for(int i=0;i<link.length;i++) {
//			System.out.println(Long.toHexString(link[i]));
//		}
//		System.out.println(Arrays.toString(index));

		for(int i=0;i<Q;i++) {
			final int p = sc.nextInt();
			final int x = sc.nextInt();
			cnt[p]+=x;
		}
		search(val, cnt, link, index, 0, 1, 0);
//		out.println(Arrays.toString(cnt));
//		out.println(Arrays.toString(val));
//		out.println(Arrays.deepToString(link));
		out.print(val[1]);
		for(int i=2;i<val.length;i++) {
			out.print(" "+val[i]);
		}
		out.println();
	}
	public static void search(final int[] val, int[] cnt, long[] link, int[] index, int parent, int self, int sum) {
//		System.out.println(self);
		final int nextSum = sum + cnt[self];
		val[self] = nextSum;
		for(int i=index[self];i<index[self+1];i++) {
			final int next = (int)(link[i]&0xFFFFFFFF);
			if(parent!=next) {
				search(val, cnt, link, index, self, next, nextSum);
			}
		}
	}
}

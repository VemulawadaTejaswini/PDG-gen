import java.io.PrintStream;
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
		final int link[][] = new int[N+1][N+1];
		final int val[] = new int[N+1];
		for(int i=0;i<N-1;i++) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			link[a][++link[a][0]]=b;
			link[b][++link[b][0]]=a;
		}
		for(int i=0;i<Q;i++) {
			final int p = sc.nextInt();
			final int x = sc.nextInt();
			cnt[p]+=x;
		}
		search(val, cnt, link, 0, 1, 0);
//		out.println(Arrays.toString(cnt));
//		out.println(Arrays.toString(val));
//		out.println(Arrays.deepToString(link));
		out.print(val[1]);
		for(int i=2;i<val.length;i++) {
			out.print(" "+val[i]);
		}
		out.println();
	}
	public static void search(final int[] val, int[] cnt, int[][] link, int parent, int self, int sum) {
//		System.out.println(self);
		final int nextSum = sum + cnt[self];
		val[self] = nextSum;
		for(int i=0;i<link[self][0];i++) {
			final int next = link[self][i+1];
			if(parent!=next) {
				search(val, cnt, link, self, link[self][i+1], nextSum);
			}
		}
	}
}

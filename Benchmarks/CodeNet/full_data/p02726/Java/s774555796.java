import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		int[] cnt = new int[N];
		for ( int i = 1 ; i <= N ; i++ ) {
			LinkedList<Integer> q = new LinkedList<>();
			int[] d = new int[N+2];
			Arrays.fill(d, -1);
			d[0] = 1;
			d[N+1] = 1;
			d[i] = 0;
			q.add(i);
			while (q.size() > 0) {
				int cur = q.poll();
				int dn = d[cur] + 1;
				if ( d[cur-1] < 0 ) {
					d[cur-1] = dn;
					cnt[dn]++;
					q.add(cur-1);
				}
				if ( d[cur+1] < 0 ) {
					d[cur+1] = dn;
					cnt[dn]++;
					q.add(cur+1);
				}
				if ( cur == X && d[Y] < 0 ) {
					d[Y] = dn;
					cnt[dn]++;
					q.add(Y);
				}
				if ( cur == Y && d[X] < 0 ) {
					d[X] = dn;
					cnt[dn]++;
					q.add(X);
				}
			}
		}
		StringBuilder ans = new StringBuilder();
		for ( int i = 1 ; i < N ; i++ ) {
			ans.append(cnt[i] / 2);
			ans.append("\n");
		}
		System.out.println(ans);
	}
}

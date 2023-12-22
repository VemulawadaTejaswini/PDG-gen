import java.util.Scanner;

/**
 * https://abc048.contest.atcoder.jp/tasks/arc064_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		long[] a = new long[N];
		for(int i=0; i<N; i++){
			a[i] = Long.parseLong(sc.next());
		}
		sc.close();

		long ans = 0;
		for(int i=1; i<N; i++){
			if(a[i-1]+a[i]<=x) continue;
			long m = a[i-1]+a[i]-x;
			ans += m;
			a[i] = Math.max(0, a[i]-m);
		}
		System.out.println(ans);
	}

}

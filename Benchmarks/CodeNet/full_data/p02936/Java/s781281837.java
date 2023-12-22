import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();

		// 子をキーにして親を記録 → 木なので根以外は必ず単一の親を持つ
		HashMap<Integer, Integer> map = new HashMap<>();
		for ( int i = 1; i < n; i++ ) {
			int a = in.nextInt();
			int b = in.nextInt();
			map.put(b, a);
		}

		long[] cnt = new long[n + 1];
		for ( int i = 1; i <= q; i++ ) {
			int p = in.nextInt();
			int x = in.nextInt();
			cnt[p] += x;
		}

		for ( int i = 2; i <= n; i++ ) {
			// 子に親から降りてきたカウントを加算	
			System.out.println( cnt[i] += cnt[map.get(i)] );
		}
		for ( int i = 1; i <= n; i++ ) {
			// 表示			
			System.out.println( cnt[i] );
		}
		in.close();
	}
}

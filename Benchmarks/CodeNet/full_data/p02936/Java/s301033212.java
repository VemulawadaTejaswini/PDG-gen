import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static long[]								cnt	= null;
	static HashMap<Integer, ArrayList<Integer>>	map	= null;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();

		// 各ノードの直属の子（自分を含む）を記録したい
		map = new HashMap<>();
		for ( int i = 1; i <= n; i++ ) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(i);
			map.put(i, list);
		}
		for ( int i = 1; i < n; i++ ) {
			int a = in.nextInt();
			int b = in.nextInt();

			ArrayList<Integer> temp = map.get(a);
			temp.add(b);
			map.put(a, temp);
		}

		cnt = new long[n + 1];
		for ( int i = 1; i <= q; i++ ) {
			int p = in.nextInt();
			int x = in.nextInt();
			cnt[p] += x;
		}

		for ( int i = 1; i <= n; i++ ) {
			calc(map.get(i), i, cnt[i]);
			System.out.print(cnt[i] + " ");
		}

		in.close();
	}

	private static void calc(ArrayList<Integer> list, int p, long x) {
		if ( list.size() == 1 ) {
			return;
		}
		for ( Integer c : list ) {
			if ( p != c ) {
				cnt[c] += x;
			}
		}
	}
}

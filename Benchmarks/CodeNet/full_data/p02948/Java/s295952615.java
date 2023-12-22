import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static LinkedList<Integer> pool;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		// ArrayList<ArrayList<Integer>> jobs = new ArrayList<>(m + 1); // 遅延日数ごとに仕事をグルーピングする
		ArrayList<LinkedList<Integer>> jobs = new ArrayList<>(m + 1);
		for ( int i = 0; i <= m; i++ ) {
			LinkedList<Integer> a = new LinkedList<>();
			a.add(0); // ダミー要素
			jobs.add(a);
		}

		for ( int i = 0; i < n; i++ ) {
			int d = in.nextInt();
			int f = in.nextInt();
			if ( d > m ) continue; // 遅延日数的に候補になりえない仕事は除外
			jobs.get(d).add(f);
		}

//		for ( int i = 0; i <= m; i++ ) {
//			System.out.println(i + " " + jobs.get(i));
//		}

		long total = 0;
		pool = new LinkedList<Integer>(); // job候補のプール
		pool.add(0); // ダミー
		// m日目をゼロとして考え後退していく days:残り日数
		for ( int today = 0; today <= m; today++ ) {
			// 候補の増分を統合し、ソート
			//			pool.addAll(jobs.get(today));
			//			Collections.sort(pool);
			//
			//			// サイズ縮小
			//			if ( pool.size() > m - today ) {
			//				while ( pool.size() > m ) {
			//					pool.remove(0);
			//				}
			//			}
			// System.out.println("pool" + pool);
			pool = margeAndSort(jobs.get(today), m - today);

			// 最後尾＝最大
			int daypay = pool.pollLast();

			if ( daypay == 0 ) continue;

			// System.out.println("days:" + today + " earn +=" + daypay);
			total += daypay;

		}

		System.out.println(total);
		in.close();
	}

	private static LinkedList<Integer> margeAndSort(LinkedList<Integer> targ, int size) {
		LinkedList<Integer> result = new LinkedList<>();
		Collections.sort(targ);

		while ( result.size() <= size && !(pool.size() == 0 && targ.size() == 0) ) {

			if ( pool.size() == 0 ) result.addFirst(targ.pollLast());
			else
			if ( targ.size() == 0 ) result.addFirst(pool.pollLast());
			else {
				if ( pool.getLast() < targ.getLast() ) result.addFirst(targ.pollLast());
				else result.addFirst(pool.pollLast());
			}
		}

		// System.out.println("result" + result);

		return result;
	}
}

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static LinkedList<Integer> pool;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		LinkedList<Integer>[] jobs = new LinkedList[m + 1]; // 遅延日数ごとに仕事をグルーピングする
		for ( int i = 0; i <= m; i++ ) {
			LinkedList<Integer> a = new LinkedList<>();
			a.add(0); // ダミー要素
			jobs[i] = a;
		}

		for ( int i = 0; i < n; i++ ) {
			int d = in.nextInt();
			int f = in.nextInt();
			if ( d > m ) continue; // 遅延日数的に候補になりえない仕事は除外
			jobs[d].add(f);
		}

//		for ( int i = 0; i <= m; i++ ) {
//			System.out.println(i + " " + jobs.get(i));
//		}

		long total = 0;
		pool = new LinkedList<Integer>(); // job候補のプール
		pool.add(0); // ダミー
		
		// m日目をゼロとして考え後退していく days:残り日数
		for ( int today = 0; today <= m; today++ ) {

			pool = margeAndSort(jobs[today], m - today);
			int daypay = pool.pollLast();

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

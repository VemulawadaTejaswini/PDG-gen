import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<ArrayList<Integer>> jobs = new ArrayList<>(); // 遅延日数ごとに仕事をグルーピングする
		for ( int i = 0; i <= m; i++ ) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(0); // ダミー要素
			jobs.add(a);
		}

		long earn = 0;
		for ( int i = 0; i < n; i++ ) {
			int d = in.nextInt();
			int f = in.nextInt();
			if ( d <= m ) jobs.get(d).add(f); // 遅延日数的に候補になりえない仕事は除外
		}

//		for ( int i = 0; i <= m; i++ ) {
//			System.out.println(i + " " + jobs.get(i));
//		}

		ArrayList<Integer> pool = new ArrayList<Integer>(); // job候補のプール
		// m日目をゼロとして考え後退していく days:残り日数
		for ( int day = 0; day <= m; day++ ) {
			pool.addAll(jobs.get(day));

			// 稼ぎのいい仕事を探す
			int todayMax = (int) Collections.max(pool);

			//System.out.println("days:" + day + " earn +=" + todayMax);
			earn += todayMax;
			
			pool.set(pool.indexOf(todayMax), 0);		// 使った最大値を0でつぶす
		}

		System.out.println(earn);
		in.close();
	}
}

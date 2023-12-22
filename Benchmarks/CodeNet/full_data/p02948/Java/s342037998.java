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
			if ( d <= m ) jobs.get(d).add(f);
		}

		//		for ( int i = 0; i <= m; i++ ) {
		//			System.out.println(i + " " + jobs.get(i));
		//		}

		// m日目をゼロとして考え後退していく days:残り日数
		for ( int days = 0; days <= m; days++ ) {

			int todayEarn = 0;
			int idx = 0;

			// 稼ぎのいい仕事を探す
			for ( int i = 0; i <= days; i++ ) {
				int temp = (int) Collections.max(jobs.get(i));
				if ( todayEarn < temp ) {
					todayEarn = temp;
					idx = i;
				}
			}

			if ( todayEarn != 0 ) {
				//System.out.println("days:" + days + " earn +=" + todayEarn);
				earn += todayEarn;
				ArrayList<Integer> maxFrom = jobs.get(idx);
				int maxIdx = maxFrom.indexOf(todayEarn);
				maxFrom.set(maxIdx, 0);		// 使った最大値を0でつぶす				
			}
		}

		System.out.println(earn);
		in.close();
	}
}

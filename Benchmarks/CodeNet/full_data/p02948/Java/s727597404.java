import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] d_f = new String[n]; // delay_fee:遅延日数と報酬
		long earn = 0;

		for ( int i = 0; i < n; i++ ) {
			int d = in.nextInt();
			int f = in.nextInt();
			d_f[i] = d + "_" + ((int) 1e6 - f);
		}
		// 1.delayが小さい順でソート  2.delayが同じときはfeeが大きい順でソート
		Arrays.sort(d_f);

		// 復元分解		
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> f = new ArrayList<Integer>();
		for ( int i = 0; i < n; i++ ) {
			String[] s = d_f[i].split("_");
			d.add(Integer.parseInt(s[0]));
			f.add((int) 1e6 - Integer.parseInt(s[1]));
			// System.out.println(d.get(d.size() - 1) + " " + f.get(f.size() - 1));
		}

		// 後ろから決めていく
		for ( int day = m - 1; 0 <= day; day-- ) {

			int todayEarn = -1;
			int idx = -1;

			// 稼ぎのいい仕事を探す
			for ( int i = 0; i < f.size() && i < d.size(); i++ ) {
				// 稼ぎが向上しないならスルー
				int fee = f.get(i);
				if ( fee < todayEarn ) continue;

				// 日数超過でこれ以上探しても意味がなくなったらブレイク
				int delay = d.get(i);
				if ( day + delay > m ) break;
				
				todayEarn = fee;
				idx = i;
			}

			if ( todayEarn != -1 ) {
				System.out.println("day:" + day + " earn +=" + todayEarn);
				earn += todayEarn;
				f.set(idx, Integer.MIN_VALUE); // 使った仕事はつぶす
			}
		}

		System.out.println(earn);
		in.close();
	}
}

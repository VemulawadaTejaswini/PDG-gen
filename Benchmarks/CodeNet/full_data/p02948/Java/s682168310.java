import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] f_d = new String[n]; // fee_delay:報酬と遅延日数
		long earn = 0;

		for ( int i = 0; i < n; i++ ) {
			int d = in.nextInt();
			int f = in.nextInt();
			f_d[i] = ((int) 1e6 - f) + "_" + d;
		}
		// 1.feeが大きい順でソート  2.feeが同じときはdelayが小さい順でソート
		Arrays.sort(f_d);

		// 復元分解
		LinkedList<Integer> f = new LinkedList<Integer>();
		LinkedList<Integer> d = new LinkedList<Integer>();
		for ( int i = 0; i < n; i++ ) {
			String[] s = f_d[i].split("_");
			f.add((int) 1e6 - Integer.parseInt(s[0]));
			d.add(Integer.parseInt(s[1]));
			//System.out.println(f.getLast() + " " + d.getLast());
		}

		// 後ろから決めていく
		for ( int day = m; 0 <= day; day-- ) {

			for ( int i = 0; i < f.size() && i < d.size(); i++ ) {
				int delay = d.get(i);
				if ( day + delay <= m ) {
					int fee = f.get(i);
					// System.out.println("delay is " + delay + ", fee is " + fee + ", day is " + day);
					earn += fee;
					f.remove(i);
					d.remove(i);
					break;
				}
			}
		}

		System.out.println(earn);
		in.close();
	}
}
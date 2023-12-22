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
			d_f[i] = d + "_" + f;
		}
		// delayが小さい順でソート
		Arrays.sort(d_f);

		// 復元分解		
		int[] d = new int[n];
		int[] f = new int[n];
		for ( int i = 0; i < n; i++ ) {
			String[] s = d_f[i].split("_");
			d[i] = Integer.parseInt(s[0]);
			f[i] = Integer.parseInt(s[1]);
		}

//		for ( int i = 0; i < n; i++ ) {
//			System.out.println(d[i] + " " + f[i]);
//		}

		// m日目をゼロとして考える
		for ( int day = 1; day <= m; day++ ) {

			int todayEarn = -1;
			int idx = -1;

			// 稼ぎのいい仕事を探す
			for ( int i = 0; i < n; i++ ) {
				int fee = f[i];
				int delay = d[i];
				
				if ( day < delay ) break; 	 // 日数超過でこれ以上探しても意味がなくなったらブレイク

				if ( todayEarn < fee ) {	// 稼ぎが上がるなら更新
					todayEarn = fee;
					idx = i;
				}
			}

			if ( todayEarn != -1 ) {
				//System.out.println("day:" + day + " earn +=" + todayEarn);
				earn += todayEarn;
				f[idx] = -1; // 使った仕事はつぶす
			}
		}

		System.out.println(earn);
		in.close();
	}
}
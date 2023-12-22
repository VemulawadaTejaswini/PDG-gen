import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		long c = Long.parseLong(sc.next());

		ArrayList<Long> x = new ArrayList<Long>();
		ArrayList<Long> v = new ArrayList<Long>();

		for(int i = 0; i < n; i++) {
			x.add(Long.parseLong(sc.next()));
			v.add(Long.parseLong(sc.next()));
		}

		/**
		 * 方針について（※Nが大きい場合TLEが発生する可能性あり）
		 * 1) 時計回りに全ての寿司を食べた場合の差し引きカロリー、1個を除く寿司を食べた場合…を順に計算
		 * 2) それぞれについて、反時計回りに残りの寿司を食べた場合の差し引きカロリー、1個を除く…を順に計算
		 * 3) 1,2の合計の組み合わせで最大値を算出
		 * 実際のアルゴリズムでは、1の繰り返しの中で2の繰り返しを入れる
		 *
		 * 先に逆時計回りを行う、というパターンがある！！！！！
		 */

		//時計回りでの累積摂取カロリー
		ArrayList<Long> v_clockwise = new ArrayList<Long>();
		//反時計回りでの（始点からの）累積摂取カロリー
		ArrayList<Long> v_anticlockwise = new ArrayList<Long>();
		//累積の計算
		v_clockwise.add(v.get(0));
		v_anticlockwise.add(v.get(n - 1));
		for(int i = 1; i < n; i++) {
			v_clockwise.add(v.get(i) + v_clockwise.get(i - 1));
			v_anticlockwise.add(v.get(n - 1 - i) + v_anticlockwise.get(i - 1));
		}

		long maxcal = 0; //最適値は0で初期化
		long cal1, cal2;
		//累積カロリーを用いて差し引きの最適値を計算する
		for(int i = -1; i < n; i++) {//時計回り
			if(i == -1) {
				cal1 = 0;
			}else {
				cal1 = v_clockwise.get(i) - x.get(i);
			}

			if(cal1 >= 0) { //時計回りで差し引きマイナスの地点から戻る意味はないので
				for(int j = -1; j < n - 1 - i; j++) { //反時計回り
					if(j == -1) {
						cal2 = cal1;
					}else {
						if(i == -1) {
							cal2 = cal1 + v_anticlockwise.get(j) - (c - x.get(n - 1 - j));
						}else {
							cal2 = cal1 + v_anticlockwise.get(j) - (c - x.get(n - 1 - j)) - x.get(i);
						}
					}

					if(cal2 > maxcal) {
						maxcal = cal2;
					}
				}
			}
		}

		//先に逆時計回りを行うパターンについても導き出す（j,iそれぞれ-1の場合は順序が関係しないので不要）
		for(int j = 0; j < n; j++) {//逆時計回り
			cal1 = v_anticlockwise.get(j) - (c - x.get(n - 1 - j));
			for(int i = 0; i < n - 1 - j; i++) { //時計回り
				cal2 = cal1 + v_clockwise.get(i) - x.get(i) - (c - x.get(n - 1 - j));
				if(cal2 > maxcal) {
					maxcal = cal2;
				}
			}
		}

		System.out.println(maxcal);
	}

}

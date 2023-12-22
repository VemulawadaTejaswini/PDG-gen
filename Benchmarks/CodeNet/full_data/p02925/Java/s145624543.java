import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);

		Deque<Integer>[] A = new Deque[n + 1];
		HashSet<Integer> hasMatch = new HashSet<>(); // 全試合終了してないｐのリスト
		for ( int r = 1; r <= n; r++ ) {
			hasMatch.add(r);
			A[r] = new ArrayDeque<Integer>();
			inputs = br.readLine().split(" ");
			for ( int c = 0; c < n - 1; c++ ) {
				A[r].push(Integer.parseInt(inputs[c]));
			}
		}

		int match = n * (n - 1) / 2;
		int days = 0;

		HashSet<Integer> todayDone = new HashSet<>(); // その日の試合が成立して除外された選手をここに入れる
		HashSet<Integer> matchDone = new HashSet<>(); // 全試合終了したｐ
		do {
			days++;
			todayDone.clear();
			matchDone.clear();

			// p:player opp:opponent
			//			for ( int p = 1; p <= n; p++ ) {
			for ( Integer p : hasMatch ) {
				if ( todayDone.contains(p) ) continue;
				Integer opp = A[p].peek();
				if ( opp == null ) {
					matchDone.add(p);
					continue;
				}

				if ( todayDone.contains(opp) ) continue;
				Integer opps_opp = A[opp].peek();
				if ( opps_opp == null ) {
					matchDone.add(opp);
					continue;
				}

				// 対戦可能相手の対戦可能相手がｐだったら試合成立
				if ( p == opps_opp ) {
					todayDone.add(A[p].pollFirst());
					todayDone.add(A[opp].pollFirst());
					match--;
				}
			}
			hasMatch.removeAll(matchDone);

			// 手詰まりになったら終了
		} while ( todayDone.size() != 0 );

		int result = (match != 0 ? -1 : days - 1);
		System.out.println(result);
		br.close();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);

		Deque<Integer>[] A = new Deque[n + 1];
		ArrayList<Integer> notAllDone = new ArrayList<>(); // 全試合終了してないｐのリスト
		for ( int r = 1; r <= n; r++ ) {
			notAllDone.add(r);
			A[r] = new ArrayDeque<Integer>();
			inputs = br.readLine().split(" ");
			for ( int c = 0; c < n - 1; c++ ) {
				A[r].push(Integer.parseInt(inputs[c]));
			}
		}

		int match = n * (n - 1) / 2;
		int days = 0;

		HashSet<Integer> todayDone = new HashSet<>(); // その日の試合が成立して除外された選手をここに入れる
		ArrayList<Integer> allDone = new ArrayList<>(); // 全試合終了したｐ
		do {
			days++;
			todayDone.clear();
			allDone.clear();

			// p:player opp:opponent
			//			for ( int p = 1; p <= n; p++ ) {
			for ( Integer p : notAllDone ) {
				if ( todayDone.contains(p) ) continue;
				Integer opp = A[p].peek();
				if ( opp == null ) {
					allDone.add(p);
					continue;
				}

				if ( todayDone.contains(opp) ) continue;
				Integer opps_opp = A[opp].peek();
				if ( opps_opp == null ) {
					allDone.add(opp);
					continue;
				}

				// 対戦可能相手の対戦可能相手がｐだったら試合成立
				if ( p == opps_opp ) {
					todayDone.add(A[p].pollFirst());
					todayDone.add(A[opp].pollFirst());
					match--;
				}
			}
			for ( Integer p : allDone ) {
				notAllDone.remove(p);
			}

			// 手詰まりになったら終了
		} while ( todayDone.size() != 0 );

		int result = (match != 0 ? -1 : days - 1);
		System.out.println(result);
		br.close();
	}
}

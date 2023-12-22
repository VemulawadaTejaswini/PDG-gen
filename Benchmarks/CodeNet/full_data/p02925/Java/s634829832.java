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

		ArrayList<Deque<String>> matches = new ArrayList<>();   //  matches[i] → i選手の試合コードリスト
		for ( int p = 1; p <= n; p++ ) {
			inputs = br.readLine().split(" ");
			Deque<String> temp = new ArrayDeque<>();
			for ( int c = 0; c < n - 1; c++ ) {
				int r = Integer.parseInt(inputs[c]);
				String code = Math.min(r, p) + "_" + Math.max(r, p);
				temp.addLast(code);
			}
			matches.add(temp);
		}

		int match = n * (n - 1) / 2;
		int days = 0;

		HashSet<Integer> todayDone = new HashSet<>(); // その日の試合が成立して除外された選手をここに入れる
		//HashSet<Integer> toRemove = new HashSet<>(); // 成立した試合

		do {
			days++;
			todayDone.clear();
			//toRemove.clear();

			// p:player r:rival
			for ( int p = 0; p < matches.size(); p++ ) {
				if ( todayDone.contains(p) ) continue;

				String code1 = matches.get(p).peek();
				if ( code1 == null ) continue;

				for ( int r = 0; r < matches.size(); r++ ) {
					if ( p == r || todayDone.contains(r) ) continue;

					String code2 = matches.get(r).peek();
					if ( code2 == null ) continue;

					// 試合成立のとき
					if ( code1.equals(code2) ) {
						todayDone.add(p);
						todayDone.add(r);
						match--;
						break;
					}
				}
			}
			for ( Integer i : todayDone ) {
				matches.get((int) i).removeFirst();
			}

		} while ( todayDone.size() > 0 );

		System.out.println(match == 0 ? days - 1 : -1);
		br.close();
	}
}

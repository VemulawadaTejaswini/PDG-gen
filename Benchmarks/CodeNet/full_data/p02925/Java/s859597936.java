import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);

		int tb[][] = new int[N + 1][N]; // pのn番目の対戦相手 r = tb[p][n]  (1-origin 
		int pIdx[] = new int[N + 1];	// pの試合消化数 = pIdx[p]       同上

		// p:player  r:rival
		for ( int p = 1; p <= N; p++ ) {
			pIdx[p] = 1;

			inputs = br.readLine().split(" ");
			for ( int n = 1; n <= N - 1; n++ ) {
				int r = Integer.parseInt(inputs[n - 1]);
				tb[p][n] = r;
			}
		}

		int match = N * (N - 1) / 2;
		int days = 0;

		HashSet<Integer> todayDone = new HashSet<>(); // その日の試合が成立して除外された選手をここに入れる 

		do {
			days++;
			todayDone.clear();

			for ( int p = 1; p <= N; p++ ) {
				if ( todayDone.contains(p) ) continue;
				if ( pIdx[p] >= N ) continue;

				int r = tb[p][pIdx[p]];
				if ( todayDone.contains(r) ) continue;
				if ( pIdx[r] >= N ) continue;
				
				// pの相手の相手がpだったら試合成立
				int r_r = tb[r][pIdx[r]];				
				if ( p == r_r ) {
					todayDone.add(p);
					todayDone.add(r);
					pIdx[p]++;
					pIdx[r]++;
					match--;
				}
			}

		} while ( todayDone.size() > 0 );

		System.out.println(match == 0 ? days - 1 : -1);
		br.close();
	}
}

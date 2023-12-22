import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		
		System.out.println(N*(N-1)/2);

	}

}
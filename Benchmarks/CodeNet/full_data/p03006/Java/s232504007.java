import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for ( int i = 0; i < n; i++ ) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		HashMap<int[], Integer> vectorCnt = new HashMap<>();
		int[] vec = new int[2];
		int maxV = 0;
		for ( int targ = 0; targ < n; targ++ ) {

			for ( int next = 0; next < n; next++ ) {

				vec[0] = x[next] - x[targ];
				vec[1] = y[next] - y[targ];

				if ( vec[0] == 0 && vec[0] == 0 ) {
					// 0移動はカウントしない
				} else {
					// 後 - 前 がマップにあったら個数を加算
					if ( vectorCnt.containsKey(vec) ) {
						//System.out.println(vec[0] + " " + vec[1]);
						vectorCnt.put(vec, vectorCnt.get(vec) + 1);
					} else
					// 無かったら登録して個数は１
					{
						vectorCnt.put(vec, 1);
					}
				}
			}
			for ( Integer val : vectorCnt.values() ) {
				//System.out.println(val);
				if ( val > maxV ) maxV = val;
			}
			vectorCnt.clear();
		}
		//System.out.println(maxV);
		System.out.println(n - maxV);
		in.close();
	}
}

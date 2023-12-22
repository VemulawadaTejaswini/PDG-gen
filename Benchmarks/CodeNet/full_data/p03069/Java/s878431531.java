import java.util.Scanner;

public class Main {

	// https://atcoder.jp/contests/tenka1-2019-beginner/submissions/5053915
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.nextLine());
			String S = sc.next();
			int[] b = new int[N];
			int[] w = new int[N];

			if (S.charAt(0) == '#') b[0] = 1;
			else w[0] = 1;
			
			for (int i = 1; i < N; i++) {
				b[i] = b[i-1];
				w[i] = w[i-1];
				
				if (S.charAt(i) == '#') b[i]++;
				else w[i]++;
			}

			
			int ans = N;
			/*
			 * 文字間のことを境目と呼ぶ。
			 * 境目より右側の白石と、左側の黒石の個数の和が一時的な答えになる
			 * 
			 * ”N-1”は配列の一番後ろの要素のこと
			 * 境目より右側の白石は、jのとき、w[N-1] - w[j-1]を呼び出すと求められる
			 * "白石全ての個数 "- "j-1までに出現した白石の個数"
			 */
			for (int j = 0; j < N; j++) {
				if (j == 0) {
					// 左端なので、右側の白石のみを考慮する。
					
					ans = Math.min(ans, w[N-1]);
				} else if (j == N) {
					// 右端なので、左側の黒石のみを考慮する。
					ans = Math.min(ans, b[N-1]);
				} else {
					ans = Math.min(ans , b[j-1] + (w[N-1] + w[j-1]));
				}
			}
			
			System.out.println(ans);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

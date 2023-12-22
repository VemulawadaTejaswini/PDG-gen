import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] h = new int[n];
		for ( int i = 0; i < h.length; i++ ) {
			h[i] = in.nextInt();
		}

		int[] cumlativeCost = new int[n];
		Arrays.fill(cumlativeCost, Integer.MAX_VALUE);
		cumlativeCost[0] = 0;

		// i番目に来るには、(i-k)~(i-1)番目のどこかコスト最小になる杭から飛び移る
		for ( int s1 = 0; s1 < cumlativeCost.length; s1++ ) {
			for ( int s2 = s1 + 1; s2 < cumlativeCost.length && s2 <= s1 + k; s2++ ) {
				// （ジャンプ元までの最適コスト + ジャンプ元からのコスト） or (従前の値) のうち小さい方で更新
				cumlativeCost[s2] = Math.min(cumlativeCost[s1] + Math.abs(h[s2] - h[s1]), cumlativeCost[s2]);
			}
		}

		System.out.println(cumlativeCost[n - 1]);
		in.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		String S = sc.next();
		
		long rCount = 0;
		long gCount = 0;
		long bCount = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'R') rCount++;
			if (S.charAt(i) == 'G') gCount++;
			if (S.charAt(i) == 'B') bCount++;
		}
		long total = rCount * gCount * bCount;
		
		int count = 0;
		for (int i = 1; i <= N-2; i++) {
			for (int j = i+1; j <= N-1; j++) {
				int k = j + (j - i);
				if (k > N) {
					continue;
				}
				if (S.charAt(i-1) != S.charAt(j-1) &&
					S.charAt(j-1) != S.charAt(k-1) &&
					S.charAt(k-1) != S.charAt(i-1)) {
					count++;
				}
			}
		}
		// 結果の出力
		System.out.println(total - count);

		sc.close();
	}
}

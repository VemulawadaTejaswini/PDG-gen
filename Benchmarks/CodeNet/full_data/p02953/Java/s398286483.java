import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// Hiを配列に格納
		long[] H = new long[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		
		// 単調非減少の判定
		String result = "Yes";
		for (int i = 0; i < N - 1; i++) {
			if (H[i] - H[i+1] >= 2) {
				result = "No";
				break;
			}
			else if (H[i] - H[i+1] <= 1) {
				H[i] = H[i] - 1;
				if (i > 0 && H[i] < H[i-1]) {
					result = "No";
					break;
				}
			}
		}
		// 結果の出力
		System.out.println(result);
		
		sc.close();
	}
}

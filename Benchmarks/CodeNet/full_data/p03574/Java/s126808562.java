import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] S = new char[H + 2][W + 2];
		for (int i = 1; i <= H; i++) {
			String str = sc.next();
			for (int j = 1; j <= W; j++) {
				S[i][j] = str.charAt(j - 1);
			}
		}
		String[] result = search(S,H,W);
		for(String str: result) {
			System.out.println(str);
		}
	}

	private static String[] search(char[][] S, int H, int W) {
		String[] result = new String[H];
		//8方向探索用の配列。上から時計回りに値を格納
		int[] x = { 0, 1, 1, 1, 0, -1, -1, -1 };
		int[] y = { 1, 1, 0, -1, -1, -1, 0, 1 };
		for (int i = 1; i <= H; i++) {
			result[i-1] = "";
			for (int j = 1; j <= W; j++) {
				if (!"#".equals(String.valueOf(S[i][j]))) {
					int count = 0;
					for (int k = 0; k < 8; k++) {
						int dx = j + x[k];
						int dy = i + y[k];
						if ("#".equals(String.valueOf(S[dy][dx]))) {
							count++;
						}
					}
					result[i-1] += String.valueOf(count);
				}else {
					result[i-1] += "#";
				}
			}
		}
		return result;
	}
}

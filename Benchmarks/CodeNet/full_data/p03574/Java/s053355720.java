import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] S = new String[H];
		for (int i = 0; i < H; i++) {
			S[i] = sc.next();
		}

		int[] x = { 0, 1, 1, 1, 0, -1, -1, -1 };
		int[] y = { 1, 1, 0, -1, -1, -1, 0, 1 };
		for (int i = 0; i < H; i++) {
			String str = "";
			for (int j = 0; j < W; j++) {
				if (j + 1 == W) {
					if ("#".equals(String.valueOf(S[i].charAt(j)))) {
						str = str + "#";
						continue;
					}
				}
				int count = 0;
				for (int k = 0; k < 8; k++) {
					int dx = j + x[k];
					int dy = i + y[k];
					if (dx < 0 || W <= dx || dy < 0 || H <= dy) {
						continue;
					}
					if ("#".equals(String.valueOf(S[dy].charAt(dx)))) {
						count++;
					}
				}
				str = str + String.valueOf(count);
			}
			System.out.println(str);
		}
	}
}

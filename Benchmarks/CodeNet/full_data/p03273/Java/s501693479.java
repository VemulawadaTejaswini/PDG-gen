import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] cs = new char[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			if (s.contains("#")) {
				cs[i] = s.toCharArray();
			} else {
				Arrays.fill(cs[i], '1');
			}
		}
		for (int i = 0; i < W; i++) {
			int count = 0;
			for (int j = 0; j < cs.length; j++) {
				System.out.println(cs[j][W - 1]);
				if (cs[j][i] == '.' || cs[j][i] == '1') {
					count++;
				}
			}
			if (count == W) {
				for (int j = 0; j < cs.length; j++) {
					cs[j][i] = '1';
				}
			}
		}
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs[i].length; j++) {
				if (cs[i][j] != '1') {
					System.out.print(cs[i][j]);
					if (j == cs[i].length - 1) {
						System.out.println();
					}
				}
			}
		}
		sc.close();
	}
}
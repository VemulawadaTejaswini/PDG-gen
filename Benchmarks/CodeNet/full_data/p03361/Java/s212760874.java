import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		boolean flag[][] = new boolean[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				if (str[j].equals("#")) {
					flag[i][j] = true;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (flag[i][j]) {
					if ((i > 0 && flag[i - 1][j]) || (i < h - 1 && flag[i + 1][j]) || (j > 0 && flag[i][j - 1])
							|| (j < w - 1 && flag[i][j + 1])) {
						continue;
					}
					System.out.println("No");
					return;
				}
			}
		}

		System.out.println("Yes");
	}
}

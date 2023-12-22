import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		List<String> list = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] % 2 == 1) {
					if (j == w - 1) {
						if (i != h - 1) {
							a[i][j]--;
							a[i + 1][j]++;
							list.add((i + 1) + " " + (j + 1) + " " + (i + 2) + " " + (j + 1));
						}
					} else {
						a[i][j]--;
						a[i][j + 1]++;
						list.add((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2));
					}
				}
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(list.size());
		for (String str : list) {
			pw.println(str);
		}
		pw.flush();
	}
}

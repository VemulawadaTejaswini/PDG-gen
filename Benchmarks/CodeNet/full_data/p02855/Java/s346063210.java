import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		String matrix[][] = new String[h][w];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			boolean flag = false;

			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
				if (str[j].equals("#")) {
					flag = true;
				}
			}

			if (!flag) {
				list.add(i);
			}
		}

		int cur = 1;
		int ans[][] = new int[h][w];

		for (int i = 0; i < h; i++) {
			if (list.contains(i)) {
				continue;
			}

			boolean first = true;
			for (int j = 0; j < w; j++) {
				if (matrix[i][j].equals("#")) {
					if (first)
						first = false;
					else
						cur++;
				}
				ans[i][j] = cur;
			}
			cur++;
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < w; j++) {
				if (list.get(i) < h - 1)
					ans[list.get(i)][j] = ans[list.get(i) + 1][j];
			}
		}

		if (list.contains(h - 1)) {
			for (int j = 0; j < w; j++) {
				ans[h - 1][j] = ans[h - 2][j];
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	static List<String> values = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String l1 = r.readLine();
		String l2 = r.readLine();
		String l3 = r.readLine();

		int[][] b = new int[3][];
		b[0] = Arrays.stream(l1.split(" ")).mapToInt(Integer::parseInt).toArray();
		b[1] = Arrays.stream(l2.split(" ")).mapToInt(Integer::parseInt).toArray();
		b[2] = Arrays.stream(l3.split(" ")).mapToInt(Integer::parseInt).toArray();

		boolean[][] res = new boolean[3][3];

		int n = Integer.parseInt(r.readLine());
		for (int i = 0; i < n; ++i) {
			String s = r.readLine();
			int v = Integer.parseInt(s);
			check(v, b, res);
		}

		if (hantei(res)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		r.close();
	}

	public static void check(int v, int[][] bingo, boolean[][] res) {
		for (int x = 0; x < res.length; ++x) {
			for (int y = 0; y < res[x].length; ++y) {
				if (bingo[x][y] == v) {
					res[x][y] = true;
					return;
				}
			}
		}
	}

	public static boolean hantei(boolean[][] res) {
		return res[0][0] & res[0][1] & res[0][2] | res[1][0] & res[1][1] & res[1][2] | res[2][0] & res[2][1] & res[2][2]
				| res[0][0] & res[1][1] & res[2][2] | res[0][2] & res[1][1] & res[2][0];
	}
}
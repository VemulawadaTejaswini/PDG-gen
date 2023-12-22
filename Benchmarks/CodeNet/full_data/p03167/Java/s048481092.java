import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	static long[][] memo;;
	static int h;
	static int w;
	static String[][] input;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		h = Integer.parseInt(str[0]);
		w = Integer.parseInt(str[1]);
		memo = new long[h][w];
		for (int i = 0; i < h; i++)
			Arrays.fill(memo[i], -1);
		input = new String[h][w];
		for (int i = 0; i < h; i++)
			input[i] = br.readLine().split("");
		out.println(dp(0, 0));
		out.flush();
	}

	public static long dp(int x, int y) {
		if (x == h - 1 && y == w - 1)
			return 1;

		if (x > h - 1 || x < 0  || y > w - 1 || y < 0 || input[x][y].equals("#"))
			return 0;

		if (memo[x][y] != -1)
			return memo[x][y];

		long right = 0, down = 0;

		right = dp(x + 1, y);

		down = dp(x, y + 1);

		long save = (int) 1e9 + 7;

		return memo[x][y] = (right + down)%save;
	}

}

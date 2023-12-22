import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		String[][] hw = new String[h][w];
		for (int i = 0; i < h; i++) {
			String tem[] = sc.next().split("");
			for (int j = 0; j < w; j++)
				hw[i][j] = tem[j];
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (hw[i][j].equals("#"))
					out.print(hw[i][j]);
				else {
					int ans = 0;
					if (i - 1 >= 0 && j - 1 >= 0 && hw[i - 1][j - 1].equals("#")) ans++;
					if (j - 1 >= 0 && hw[i][j - 1].equals("#")) ans++;
					if (i + 1 < h && j - 1 >= 0 && hw[i + 1][j - 1].equals("#")) ans++;
					if (i - 1 >= 0 && hw[i - 1][j].equals("#")) ans++;
					if (i + 1 < h && hw[i + 1][j].equals("#")) ans++;
					if (i - 1 >= 0 && j + 1 < w && hw[i - 1][j + 1].equals("#")) ans++;
					if (j + 1 < w && hw[i][j + 1].equals("#")) ans++;
					if (i + 1 < h && j + 1 < w && hw[i + 1][j + 1].equals("#")) ans++;
					out.print(ans);
				}
			}
			out.println("");
		}
		out.flush();
	}
}
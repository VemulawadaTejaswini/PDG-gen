import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] a = new char[h + 1][w + 1];
		for (int i = 0; i < h; i++) {
			String s = br.readLine();
			for (int j = 0; j < w; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		br.close();
		a[h][w - 1] = '#';

		boolean ans = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '#') {
					if (a[i + 1][j] == '#' && a[i][j + 1] != '#'
							|| a[i + 1][j] != '#' && a[i][j + 1] == '#') {
					} else {
						ans = false;
						break;
					}
				}
			}
		}
		if (ans) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}

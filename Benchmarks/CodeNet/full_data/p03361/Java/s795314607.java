import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String inputs[] = str.split(" ");
		int w = Integer.parseInt(inputs[0]);
		int h = Integer.parseInt(inputs[1]);
		char table[][] = new char[w][h];
		for (int i = 0; i < h; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < w; j++) {
				table[i][j] = tmp.charAt(j);
			}
		}
		if (resolution(table)) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}

	public static boolean resolution(char table[][]) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				if (table[i][j] != '#') {
					continue;
				}
				if (i != 0 && table[i - 1][j] == '#') {
					continue;
				}
				if (j != 0 && table[i][j - 1] == '#') {
					continue;
				}
				if (i != table.length - 1 && table[i + 1][j] == '#') {
					continue;
				}
				if (j != table.length - 1 && table[i][j + 1] == '#') {
					continue;
				}
				return false;
			}
		}
		return true;
	}

}

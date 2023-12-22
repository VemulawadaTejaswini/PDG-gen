import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][w];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		int count = 0;
		while (true) {
			if (isAllBlack(field)) {
				break;
			}
			
			char[][] next = new char[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (field[i][j] == '#') {
						next[i][j] = '#';
						if (i != 0) {
							next[i - 1][j] = '#';
						}
						if (i != h - 1) {
							next[i + 1][j] = '#';
						}
						if (j != 0) {
							next[i][j - 1] = '#';
						}
						if (j != w- 1) {
							next[i][j + 1] = '#';
						}
					}
				}
			}
			field = next;
			count++;
		}
		System.out.println(count);
	}
	
	static boolean isAllBlack(char[][] f) {
		for (char[] cc : f) {
			for (char c : cc) {
				if (c != '#') {
					return false;
				}
			}
		}
		return true;
	}
}

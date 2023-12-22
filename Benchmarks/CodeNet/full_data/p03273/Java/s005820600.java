
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] s = new String[h];
		
		boolean[] row = new boolean[h];
		boolean[] column = new boolean[w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i].charAt(j) == '#') {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		
		for (int i = 0; i < h; i++) {
			if (row[i]) {
				for (int j = 0; j < w; j++) {
					if (column[j]) {
						System.out.print(s[i].charAt(j));
					}
				}
			}
			System.out.println();
		}
		
	}
}
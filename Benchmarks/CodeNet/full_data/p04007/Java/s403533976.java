

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		String[][] aka = new String[h][w];
		String[][] ao = new String[h][w];

		ArrayList<Integer> tate = new ArrayList<>();
		ArrayList<Integer> yoko = new ArrayList<>();

		char[][] c = new char[h][];

		for (int i = 0; i < h; i++) {
			c[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (c[i][j] == '#') {
					tate.add(i);
					yoko.add(j);
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j == 0) {
					aka[i][j] = "#";
					ao[i][j] = ".";
				} else if (j == w - 1) {
					aka[i][j] = ".";
					ao[i][j] = "#";
				} else {
					if (i % 2 == 0) {
						aka[i][j] = "#";
						ao[i][j] = ".";
					} else {
						aka[i][j] = ".";
						ao[i][j] = "#";
					}
				}

			}
		}

		for (int i = 0; i < tate.size(); i++) {
			aka[tate.get(i)][yoko.get(i)] = "#";
			ao[tate.get(i)][yoko.get(i)] = "#";
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(aka[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(ao[i][j]);
			}
			System.out.println();
		}
	}

}

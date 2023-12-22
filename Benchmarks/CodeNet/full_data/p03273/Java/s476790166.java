import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] a = new String[h];
		int[] if_tate = new int[w];
		int[] if_yoko = new int[h];

		for (int i = 0; i < h; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (a[j].substring(i, i + 1).equals("#")) {
					if_tate[i] = 1;
					break;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i].substring(j, j + 1).equals("#")) {
					if_yoko[i] = 1;
					break;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			if (if_yoko[i] == 0) {
				continue;
			}

			for (int j = 0; j < w; j++) {
				if (if_tate[j] == 0) {
					continue;
				}
				System.out.print(a[i].substring(j, j + 1));
			}
			System.out.println();
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		String[][] s = new String[h][];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().split("");
			Arrays.sort(s[i]);
		}
		String[][] t = new String[w][h];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				t[i][j] = s[j][i];
			}
			Arrays.sort(t[i]);
		}
		int e = 0;
		for (int i = 0; i < h; i++) {
			int c = 1;
			int d = 0;
			for (int j = 1; j < w; j++) {
				if (s[i][j].equals(s[i][j - 1]))
					c++;
				else {
					if (c != 1 && c % 2 != 0) {
						d++;
					}
					c = 1;
				}
			}
			if (d > 1) {
				System.out.println("NO");
				return;
			}
			if (c == w)
				e++;
		}
		if (e != 0 && e != h) {
			System.out.println("NO");
			return;
		}
		e = 0;
		for (int i = 0; i < w; i++) {
			int c = 1;
			int d = 0;
			for (int j = 1; j < h; j++) {
				if (t[i][j].equals(t[i][j - 1]))
					c++;
				else {
					if (c != 0 && c % 2 != 0) {
						d++;
					}
					c = 1;
				}
			}
			if (d > 1) {
				System.out.println("NO");
				return;
			}
			if (c == h)
				e++;
		}
		if (e != 0 && e != w) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
	}
}
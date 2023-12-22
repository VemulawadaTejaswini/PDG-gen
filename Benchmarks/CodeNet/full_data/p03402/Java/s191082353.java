import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String[][] s = new String[100][100];
		int w = 0;
		int c = a - b;
		int d = c;
		while (w < a + b + d) {
			if (w % 2 == 0) {
				for (int i = 0; i <= w; i++)
					s[i][w] = s[w][i] = ".";
				if (c > 0) {
					s[w][w] = "#";
					c--;
				}
			}
			else {
				for (int i = 0; i <= w; i++)
					s[i][w] = s[w][i] = "#";
				if (c < 0) {
					s[w][w] = ".";
					c++;
				}
			}
			w++;
		}
		System.out.println(w + " " + w);
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++)
				System.out.print(s[i][j]);
			System.out.println();
		}
		System.out.println();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char s[][] = new char[H + 2][W + 2];
		String temp = "";
		for (int i = 0; i < H + 2; i++) {
			if (i != 0 && i != H + 1) {
				temp = sc.next();
			}
			for (int j = 0; j < W + 2; j++) {
				if (i != 0 && i != H + 1 && j != 0 && j != W + 1) {
					s[i][j] = temp.charAt(j-1);
				}
			}
		}
		boolean flag = true;
		for (int i = 1; i < H + 1; i++) {
			for (int j = 1; j < W + 1; j++) {
				if (s[i][j] == '#' && s[i][j - 1] == '.' && s[i][j + 1] == '.' && s[i - 1][j] == '.'
						&& s[i + 1][j] == '.') {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
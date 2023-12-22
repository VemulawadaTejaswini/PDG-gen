import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean result = true;

		String S[] = new String[50];

		for (int i = 0; i < H; i++) {
			S[i] = sc.next();
		}

		loop1: for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (S[i].charAt(j) == '.') {
					continue;
				}

				boolean existBlack = false;

				if (i - 1 >= 0 && S[i - 1].charAt(j) == '#') {
					existBlack = true;
				} else if (i + 1 < H  && S[i + 1].charAt(j) == '#') {
					existBlack = true;
 				} else if (j - 1 >= 0 && S[i].charAt(j - 1) == '#') {
					existBlack = true;
 				} else if (j + 1 < W && S[i].charAt(j + 1) == '#') {
					existBlack = true;
				}

				if (!existBlack) {
					result = false;
					break loop1;
				}
			}
		}

		System.out.println(result ? "Yes" : "No");
	}
}
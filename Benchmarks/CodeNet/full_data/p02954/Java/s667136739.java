import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int len = S.length();

		int[] itg = new int[100000];

		for (int i = 0; i < len; i++) {
			itg[i] = 1;
		}

		for (int j = 0; j < len / 2 + (len / 2) % 2; j++) {
			int[] aft = new int[100000];

			for (int i = 0; i < len; i++) {
				if (S.charAt(i) == 'R') {
					aft[i + 1] += itg[i];
				} else {
					aft[i - 1] += itg[i];
				}
			}
			itg = aft;
		}

		for (int i = 0; i < len; i++) {
			System.out.print(String.valueOf(itg[i]) + " ");
		}
		System.out.println();
	}
}
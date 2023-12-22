import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		no4();
	}

	static void no4() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int i = 13;

			StringBuffer sb = new StringBuffer("2 3 5 7 11");
			int count = 5;

			int a1 = 3;
			int a2 = 5;
			int a3 = 7;
			int a4 = 11;

			while (count < n) {
				int yakusu = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						yakusu++;
					}
					if (yakusu > 2) {
						break;
					}
				}
				if (yakusu == 2) {
					int k = a1 + a2 + a3 + a4 + i;
					int y = 0;
					for (int j = 1; j <= k; j++) {
						if (k % j == 0) {
							y++;
						}
						if (y > 2) {
							break;
						}
					}
					if (y != 2) {
						a1 = a2;
						a2 = a3;
						a3 = a4;
						a4 = i;
						sb.append(" ");
						sb.append(i);
						count++;
					}
				}
				i++;
				i++;
			}
			System.out.print(sb.toString());
		}
	}
}
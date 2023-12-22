import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int L = s.nextInt();
			final int R = s.nextInt();

			if (R - L >= 2019) {
				System.out.println(0);
			} else {
				int ret = 2019;
				for (int i = L % 2019; i < R % 2019; i++) {
					for (int j = i + 1; j <= R % 2019; j++) {
						if ((i * j) % 2019 < ret) {
							ret = (i * j) % 2019;
						}
					}
				}
				System.out.println(ret);
			}
		}
	}
}

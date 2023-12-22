import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		int min = 2018;
		if (R - L > 2019) {
			// 全範囲
			System.out.print(0);
		} else {
			int LMod = Math.floorMod(L, 2019);
			int RMod = Math.floorMod(R, 2019);
			if (LMod < RMod) {
				for (int i = LMod; i < RMod; i++) {
					for (int j = i + 1; j <= RMod; j++) {
						int surPlus = (i * j) % 2019;
						if (surPlus < min) {
							min = surPlus;
						}
					}
				}
				System.out.print(min);
			} else {
				// 2019を含む
				System.out.print(0);
			}
		}
	}
}

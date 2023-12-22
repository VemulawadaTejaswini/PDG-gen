public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		Integer c[][] = new Integer[3][3];
		int max = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int pos = c[i][j] = s.nextInt();
				max = Math.max(max, pos);
			}
		}

		System.out.println(Main.calc(c, max) ? "Yes" : "No");
	}

	public static boolean calc(Integer c[][], int max) {
		for (int a1 = 0; a1 <= max && a1 <= 100; a1++) {
			int b1 = c[0][0] - a1;
			if (0 > b1 || b1 > 100) {
				continue;
			}
			for (int a2 = 0; a2 <= max && a2 <= 100; a2++) {
				int b2 = c[1][1] - a2;
				if (0 > b2 || b2 > 100) {
					continue;
				}
				for (int a3 = 0; a3 <= max && a3 <= 100; a3++) {
					int b3 = c[2][2] - a3;
					if (0 > b3 || b3 > 100) {
						continue;
					}
					if (c[0][1] == a1 + b2 && c[0][2] == a1 + b3 && c[1][0] == a2 + b1 && c[2][0] == a3 + b1
							&& c[2][1] == a3 + b2 && c[1][2] == a2 + b3) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String a = sc.next();
		final int b = sc.nextInt();

		int count = 0;
		String a2 = a.substring(0, 2);
		for (int i = 0; i <= 99999; i++) {
			int start = 0;
			if (i == 0) {
				String tmp = a.substring(2);
				tmp = tmp.substring(0, 1);
				start = Integer.parseInt(tmp);
			} else {
				a2 = String.valueOf(Integer.parseInt(a2) + 1);
			}
			String a2re = (new StringBuilder(a2).reverse()).toString();

			for (int j = start; j <= 9; j++) {
				// 末尾文字は反転させる
				String palindromicNumber = a2 + String.valueOf(j) + a2re;
				if (Integer.parseInt(palindromicNumber) <= b) {
					count++;
				} else {
					break;
				}
			}

		}

		System.out.print(count);

	}

}

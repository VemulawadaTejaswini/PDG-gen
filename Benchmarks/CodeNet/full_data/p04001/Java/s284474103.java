import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		long count = 0;
		int n = S.length();
		String[] Srow = new String[n];

		for (int i = 0; i < n; i++) {
			Srow[i] = S.substring(i, i+1);
		}

		if (n == 1) {
			count = Integer.parseInt(S);
		} else {
			for (int bit = 0; bit < Math.pow(2, n-1); bit++) {

				String[] temp = new String[n];
				String number = Srow[0];
				int tempIndex = 0;

				for (int shift = 0; shift < n-1; shift++) {
					if ((1&bit>>shift) == 1) {
						temp[tempIndex] = number;
						number = Srow[shift+1];
						tempIndex++;
					} else {
						number += Srow[shift+1];
					}
				}

				temp[tempIndex] = number;

				for (int wa = 0; wa < n; wa++) {
					if (temp[wa] != null) {
						count += Long.parseLong(temp[wa]);
					}
				}

			}
		}

		System.out.println(count);

	}
}

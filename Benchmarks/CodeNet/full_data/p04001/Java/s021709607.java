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

		for (int bit = 0; bit < Math.pow(2, n-1); bit++) {

			String number = Srow[0];			//countに足す数字を作っていく（初期値は最大桁の数字）

			for (int shift = 0; shift < n-1; shift++) {		//全ビット探索：1が+を入れることに対応

				if ((1&bit>>shift) == 1) {				
					count += Long.parseLong(number);
					number = Srow[shift+1];
				} else {
					number += Srow[shift+1];
				}
				
			}

			count += Long.parseLong(number);
			
		}

		System.out.println(count);

	}
}
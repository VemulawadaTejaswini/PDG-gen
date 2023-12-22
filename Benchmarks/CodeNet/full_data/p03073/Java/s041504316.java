import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		String s = sc.next();
		long a = 0, b = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (!s.substring(i, i + 1).equals("0")) {
					a++;
				}
			} else {
				if (!s.substring(i, i + 1).equals("1")) {
					a++;
				}
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (!s.substring(i, i + 1).equals("1")) {
					b++;
				}
			} else {
				if (!s.substring(i, i + 1).equals("0")) {
					b++;
				}
			}
			if (a < b) {
				break;
			}
		}
		
		if (b < a) {
			a = b;
		}

		System.out.println(a);

		sc.close();
	}
}

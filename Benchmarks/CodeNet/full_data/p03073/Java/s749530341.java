import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tileStr = sc.next();
		sc.close();
		int ZERO_START = 0;
		int ONE_START = 0;
		for (int i = 0; i < tileStr.length(); i++) {
			char tmp = tileStr.charAt(i);
			if (i % 2 == 0) {
				if (tmp == '0') {
					ONE_START++;
				} else {
					ZERO_START++;
				}
			} else {
				if (tmp == '1') {
					ONE_START++;
				} else {
					ZERO_START++;
				}
			}
		}
		if (ZERO_START < ONE_START) {
			System.out.println(ZERO_START);
		} else {
			System.out.println(ONE_START);
		}
	}
}
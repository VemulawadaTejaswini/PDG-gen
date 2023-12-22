import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		long K = scanner.nextLong();
		scanner.close();
		char[] charArray = S.toCharArray();
		long cnt = 0;

		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i - 1] == charArray[i]) {
				charArray[i] = '0';
				cnt++;
			}
		}
		if (charArray[0] == charArray[charArray.length - 1]) {
			cnt *= K;
			cnt += (K - 1);
		} else {
			cnt *= K;
		}
		if (charArray.length != 1) {
			System.out.println(cnt);
		} else if (K == 1) {
			System.out.println(0);
		} else {
			if (K % 2 == 1) {
				K++;
			}
			System.out.println(K / 2);
		}

	}
}
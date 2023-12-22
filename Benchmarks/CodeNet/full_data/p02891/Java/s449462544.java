import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int K = scanner.nextInt();
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
		System.out.println(cnt);
	}
}
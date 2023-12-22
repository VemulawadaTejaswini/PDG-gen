import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int K = in.nextInt();
		int fCount = 1;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(0) != S.charAt(i)) {
				break;
			}
			fCount++;
		}
		long ans = 0;
		int index = 0;
		while (index < S.length()) {
			int right = index;
			for (int i = right + 1; i < S.length(); i++) {
				if (S.charAt(i) != S.charAt(index)) {
					break;
				} else {
					right = i;
				}
			}
			ans += (right - index + 1) / 2;
			if (right >= S.length() - 1) {
				if (S.length() >= 2 && (right - index + 1) % 2 != 0 && fCount % 2 != 0
						&& S.charAt(0) == S.charAt(S.length() - 1)) {
					ans += 1;
					ans *= K;
					ans--;
				} else {
					ans *= K;
				}
			}
			index += right == index ? 1 : right - index + 1;
		}
		System.out.println(ans);
		in.close();
	}
}
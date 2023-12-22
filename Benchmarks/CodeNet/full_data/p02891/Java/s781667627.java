
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		long K = in.nextInt();
		int fCount = 0;
		int count = 1;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(0) != S.charAt(i)) {
				fCount = count / 2;
				break;
			}
			count++;
		}

		int lCount = 0;
		count = 1;
		for (int i = S.length() - 2; i >= 0; i--) {
			if (S.charAt(S.length() - 1) != S.charAt(i)) {
				lCount = count / 2;
				break;
			}
			count++;
		}
		int mCount = 0;
		count = 1;
		for (int i = fCount + 1; i < S.length() - 1 - lCount - 1;) {
			for (int j = i + 1; j < S.length() - 1 - lCount; j++) {
				if (S.charAt(i) != S.charAt(j)) {
					i++;
					break;
				}
				i++;
				count++;
			}
			mCount += count / 2;
			count = 1;
		}
		long ans = 0;
		if (S.charAt(0) == S.charAt(S.length() - 1) && fCount % 2 != 0 && lCount % 2 != 0) {
			ans = (fCount + mCount + lCount + 1) * K - 1;
		} else {
			ans = (fCount + mCount + lCount) * K;
		}
		System.out.println(ans);
		in.close();
	}
}
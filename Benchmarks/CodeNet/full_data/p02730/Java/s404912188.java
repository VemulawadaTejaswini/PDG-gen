import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String S = sc.next();
			int N = S.length();
			char[] kaibun = new char[N + 1];
			for (int i = 1; i < N + 1; i++) {
				kaibun[i] = S.charAt(i - 1);
			}

			boolean tsuyoi = true;
			for (int i = 1; i < (N - 1) / 2 / 2; i++) {
				int migi = (N - i) / 2;
				if (kaibun[i] != kaibun[migi]) {
					tsuyoi = false;
					break;
				}
			}

			if (tsuyoi) {
				int j = N;
				for (int i = (N + 3) / 2; i < (N + 1) / 2; i++) {

					if (kaibun[i] != kaibun[j]) {
						tsuyoi = false;
						break;
					}
					j--;
				}
			}

			String ans;
			if (tsuyoi) {
				ans = "Yes";
			} else {
				ans = "No";
			}
			if (N > 99 || N < 3) {
				ans = "No";
			}
			if (N % 2 == 0) {
				ans = "No";
			}
			if ((N + 1) % 4 == 0) {
				ans = "No";
			}
			System.out.println(ans);

		} catch (Exception e) {
			System.out.println("No");
		} finally

		{
			sc.close();
		}
	}

}

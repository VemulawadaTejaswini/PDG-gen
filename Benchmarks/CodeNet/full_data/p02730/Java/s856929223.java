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
			for (int i = 1; i < (N - 1) / 2; i++) {
				if (kaibun[i] != kaibun[(N - i) / 2]) {
					tsuyoi = false;
					break;
				}
			}

			if (tsuyoi) {
				int j = N;
				for (int i = (N + 3) / 2; i < N; i++) {

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
			System.out.println(ans);

		} finally

		{
			sc.close();
		}
	}

}

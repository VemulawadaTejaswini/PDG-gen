import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int N = sc.nextInt();
			String S = sc.next();
			int ans = 0;
			//			String[] mojiretsu = new String[N + 1];
			//			for (int a = 1; a <= N; a++) {
			//				mojiretsu[a] = String.valueOf(S.charAt(a - 1));
			//			}
			int r;
			int g;
			int b;
			for (r = 1; r <= N - 2; r++) {
				for (g = r + 1; g <= N - 1; g++) {
					for (b = g + 1; b <= N; b++) {
						if (!(S.substring(b - 1, b).equals(S.substring(g - 1, g)))) {
							if (!(S.substring(b - 1, b).equals(S.substring(r - 1, r)))) {
								if (!(S.substring(r - 1, r).equals(S.substring(g - 1, g)))) {
									if (g - r != b - g) {
										ans++;

									}
								}
							}
						}
					}
				}
			}

			System.out.println(ans);

		} finally

		{
			sc.close();
		}
	}

}

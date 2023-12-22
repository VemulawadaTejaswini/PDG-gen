import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int ma = Integer.parseInt(str[1]);
		int mb = Integer.parseInt(str[2]);

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			a[i] = Integer.parseInt(str[0]);
			b[i] = Integer.parseInt(str[1]);
			c[i] = Integer.parseInt(str[2]);
		}

		int sa[] = new int[n];
		int sb[] = new int[n];
		int sc[] = new int[n];

		sa[0] = a[0];
		sb[0] = b[0];
		sc[0] = c[0];

		for (int i = 0; i < n - 1; i++) {
			sa[i + 1] = sa[i] + a[i + 1];
			sb[i + 1] = sb[i] + b[i + 1];
			sc[i + 1] = sc[i] + c[i + 1];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int SA = sa[j] - sa[i];
				int SB = sb[j] - sb[i];
				int SC = sc[j] - sc[i];

				if (i == j) {
					SA = sa[i];
					SB = sb[i];
					SC = sc[i];
				}

				if (ma * SB == mb * SA) {
					ans = Math.min(ans, SC);
				}
			}
		}

		if (ans != Integer.MAX_VALUE)
			System.out.println(ans);
		else
			System.out.println("-1");
	}
}

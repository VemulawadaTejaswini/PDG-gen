import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String sub = s.substring(2, s.length() - 1);
		String ans = "WA";


		if (s.charAt(0) == 'A') {
			if (s.matches("[BD-Z]")) {
				;
			} else {
				int cnt = 0;
				for (int i = 0; i < sub.length(); i++) {
					if (sub.charAt(i) == 'C')
						cnt++;
				}
				if (cnt == 1)
					ans = "AC";
			}
		}

		System.out.println(ans);

		sc.close();
	}
}

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long N = Long.parseLong(S);
		long ans = 0;
		{
			long N_ = N;
			while (N_ > 0) {
				ans += N_ % 10;
				N_ /= 10;
			}
		}
		{
			long tmp = 9 * (S.length() - 1);
			tmp += (S.charAt(0) - '0') - 1;
			ans=Math.max(ans, tmp);
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
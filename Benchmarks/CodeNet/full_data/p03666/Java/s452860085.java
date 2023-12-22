import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		long n = Integer.parseInt(sa[0]);
		long a = Integer.parseInt(sa[1]);
		long b = Integer.parseInt(sa[2]);
		long c = Integer.parseInt(sa[3]);
		long d = Integer.parseInt(sa[4]);
		br.close();

		long ba = b - a;

		for (int i = 0; i < n; i++) {
			if (c * i - d * (n - 1 - i) <= ba
					&& ba <= d * i - c * (n - 1 - i)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}

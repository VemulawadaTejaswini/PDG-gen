import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int num = 0;

		Set<Integer> set = new HashSet<>();
		Set<Integer> setC = new HashSet<>();

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int s = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);

			if (s == 1 && c == 0 && n > 1) {
				System.out.println("-1");
				return;
			}
			if (set.contains(s) && setC.contains(c)) {

			} else if (!set.contains(s)) {
				num += (int) Math.pow(10, n - s) * c;
				set.add(s);
				setC.add(c);
			} else {
				System.out.println("-1");
				return;
			}

		}
		System.out.println(num);
	}
}

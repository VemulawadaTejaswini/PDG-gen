import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long a[] = new long[n];
		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		boolean zouka = false;
		boolean gensyo = false;
		int ans = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				if (zouka) {
					ans++;
					zouka = false;
					gensyo = false;
				} else {
					zouka = false;
					gensyo = true;
				}
			} else if (a[i] < a[i + 1]) {
				if (gensyo) {
					ans++;
					zouka = false;
					gensyo = false;
				} else {
					zouka = true;
					gensyo = false;
				}
			}
		}

		System.out.println(ans + 1);
	}
}

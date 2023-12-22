import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int l = Integer.parseInt(str[1]);

		int a[] = new int[n];
		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int aN = -1;

		for (int i = 0; i + 1 < n; ++i)
			if (a[i] + a[i + 1] >= l)
				aN = i;

		if (aN == -1) {
			System.out.println("Impossible");
			return;
		}

		System.out.println("Possible");
		for (int i = 0; i < aN; ++i)
			System.out.println(i + 1);
		for (int i = aN - 2; i > aN; --i)
			System.out.println(i + 1);
		System.out.println(aN + 1);
	}
}

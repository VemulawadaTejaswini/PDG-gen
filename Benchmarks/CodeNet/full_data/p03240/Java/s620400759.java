import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int x[] = new int[n];
		int y[] = new int[n];
		long h[] = new long[n];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			x[i] = Integer.parseInt(str[0]);
			y[i] = Integer.parseInt(str[1]);
			h[i] = Long.parseLong(str[2]);
		}

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				long H = -1;
				boolean flag = false;

				for (int k = 0; k < n; k++) {
					long HH = Math.max(h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j), 0);

					if (h[k] == 0)
						continue;
					if (H == -1) {
						H = HH;
					} else {
						if (H != HH) {
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println(i + " " + j + " " + H);
					return;
				}
			}
		}
	}
}

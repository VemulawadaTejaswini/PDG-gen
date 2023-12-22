import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int L[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		L = new int[n];
		for (int i = 0; i < n; i++) {
			L[i] = Integer.parseInt(str[i]);
		}

		int ans = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (L[i] < L[j] + L[k] && L[j] < L[i] + L[k] && L[k] < L[i] + L[j])
						ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
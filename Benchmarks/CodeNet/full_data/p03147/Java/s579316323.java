import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] hs = br.readLine().split(" ");
		br.close();

		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(hs[i]);
		}

		int cnt = h[0];
		for (int i = 1; i < n; i++) {
			if (h[i - 1] < h[i]) {
				cnt += h[i] - h[i - 1];
			}
		}
		System.out.println(cnt);
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int now = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == now + 1) {
				now++;
			}
		}
		if (now == 0) {
			System.out.println(-1);
		} else {
			System.out.println(n - now);
		}
	}
}

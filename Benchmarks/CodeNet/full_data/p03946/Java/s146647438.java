import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int min = a[0];
		int max = 0;
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			min = Math.min(min, a[i - 1]);
			int d = a[i] - min;
			if (d > max) {
				max = d;
				cnt = 1;
			} else if (d == max) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

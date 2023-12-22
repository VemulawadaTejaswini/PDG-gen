import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (a[i] > b[i]) {
				min = Math.min(min, b[i]);
			}
		}
		System.out.println(min == Integer.MAX_VALUE ? 0 : sum - min);
	}
}

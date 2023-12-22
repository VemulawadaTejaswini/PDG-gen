import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
//		int z = Integer.parseInt(sa[1]);
		int w = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);;
		}
		br.close();

		if (n == 1) {
			System.out.println(Math.abs(a[0] - w));
		} else {
			int m1 = Math.abs(a[n - 1] - w);
			int m2 = Math.abs(a[n - 1] - a[n - 2]);
			System.out.println(Math.max(m1, m2));
		}
	}
}

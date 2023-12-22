import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

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

		int m = 2000;
		BigInteger dp = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			dp = dp.or(dp.shiftLeft(a[i]));
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		int start = (sum + 1) / 2;
		int end = m * m;
		for (int i = start; i <= end; i++) {
			if (dp.testBit(i)) {
				System.out.println(i);
				return;
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int k = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		int[] d = new int[k];
		for (int i = 0; i < d.length; i++) {
			d[i] = Integer.parseInt(sa[i]);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			int n = Integer.parseInt(sa[0]) - 1;
			int x = Integer.parseInt(sa[1]);
			int m = Integer.parseInt(sa[2]);

			long[] d2 = new long[k + 1];
			int[] zero = new int[k + 1];
			for (int j = 0; j < d.length; j++) {
				zero[j + 1] += zero[j];
				d2[j + 1] = d2[j] + d[j] % m;
				if (d2[j] == d2[j + 1]) {
					zero[j + 1]++;
				}
			}

			int a = n / k;
			int b = n % k;
			BigInteger b0 = BigInteger.valueOf(x);
			BigInteger b1 = BigInteger.valueOf(d2[k]);
			BigInteger b2 = BigInteger.valueOf(a);
			BigInteger b3 = BigInteger.valueOf(d2[b]);
			BigInteger b4 = BigInteger.valueOf(m);
			BigInteger total = b0.add(b1.multiply(b2)).add(b3);
			long rem1 = total.divide(b4).longValueExact() - x / m;
			long rem2 = zero[k] * a + zero[b];
			long ans = n - rem1 - rem2;
			pw.println(ans);
		}
		pw.flush();
		br.close();
	}
}

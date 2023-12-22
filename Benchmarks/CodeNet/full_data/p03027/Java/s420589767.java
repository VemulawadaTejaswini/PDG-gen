import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		int[] x = new int[q];
		int[] d = new int[q];
		int[] n = new int[q];
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			d[i] = Integer.parseInt(sa[1]);
			n[i] = Integer.parseInt(sa[2]);
		}
		br.close();

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			long xi = x[i];
			long di = d[i];
			long ni = n[i];
			long n2 = ni / 2;
			if (ni % 2 == 0) {
				xi += di;
				n2--;
			}
			long m = xi + di * n2;
			m %= 1000003;
			long m2 = m * m % 1000003;
			long ans = m;
			for (int j = 1; j <= n2; j++) {
				long d2 = di * j;
				d2 %= 1000003;
				d2 = d2 * d2 % 1000003;
				long v = m2 - d2 + 1000003;
				v %= 1000003;
				ans *= v;
				ans %= 1000003;
			}
			if (ni % 2 == 0) {
				ans *= x[i];
				ans %= 1000003;
			}
			pw.println(ans);
		}
		pw.flush();
	}
}

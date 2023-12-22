import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int d = Integer.parseInt(sa[2]);
		int hw = h * w;
		int[] x = new int[hw + 1];
		int[] y = new int[hw + 1];
		for (int i = 0; i < h; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < w; j++) {
				int a = Integer.parseInt(sa[j]);
				x[a] = i;
				y[a] = j;
			}
		}
		int q = Integer.parseInt(br.readLine());
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			l[i] = Integer.parseInt(sa[0]);
			r[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long[] sum = new long[hw + 1];
		for (int i = 1; i <= d; i++) {
			int cx = x[i];
			int cy = y[i];
			for (int j = i + d; j <= hw; j += d) {
				int val = Math.abs(x[j] - cx) + Math.abs(y[j] - cy);
				sum[j] = sum[j - d] + val;
				cx = x[j];
				cy = y[j];
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			pw.println(sum[r[i]] - sum[l[i]]);
		}
		pw.flush();
	}
}

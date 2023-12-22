import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		br.close();

		if (n < 2 * k - 1) {
			System.out.println(-1);
			return;
		}

		PrintWriter pw = new PrintWriter(System.out);
		int a = k;
		int b = k + n;
		int c = k + n + n;
		int n2 = (n + 1) / 2;
		for (int i = 0; i < n2; i++) {
			int aa = a + i * 2;
			int bb = b + n2 - 1 - i;
			int cc = c + i;
			pw.println(aa + " " + bb + " " + cc);
		}
		int m = n % 2;
		if (m == 1) {
			n2--;
		}
		for (int i = 0; i < n2; i++) {
			int aa = a + 1 + i * 2;
			int bb = c - 1 - i;
			int cc = c + n2 + m + i;
			pw.println(aa + " " + bb + " " + cc);
		}
		pw.flush();
	}
}

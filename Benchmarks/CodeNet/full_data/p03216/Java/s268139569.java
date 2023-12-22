import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		int q = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] k = new int[q];
		for (int i = 0; i < q; i++) {
			k[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			long d = 0;
			long m = 0;
			long dm = 0;
			long ans = 0;
			for (int j = 0; j < n; j++) {
				if (j >= k[i]) {
					if (s[j - k[i]] == 'D') {
						d--;
						dm -= m;
					} else if (s[j - k[i]] == 'M') {
						m--;
					}
				}
				if (s[j] == 'D') {
					d++;
				} else if (s[j] == 'M') {
					m++;
					dm += d;
				} else if (s[j] == 'C') {
					ans += dm;
				}
			}
			pw.println(ans);
		}
		pw.flush();
	}
}

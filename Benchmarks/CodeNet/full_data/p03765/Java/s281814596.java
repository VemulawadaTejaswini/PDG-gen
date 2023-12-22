import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		int q = Integer.parseInt(br.readLine());
		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]);
			c[i] = Integer.parseInt(sa[2]) - 1;
			d[i] = Integer.parseInt(sa[3]);
		}
		br.close();

		int[] ss = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			ss[i + 1] = ss[i] + toInt(s.charAt(i));
		}
		int[] tt = new int[t.length() + 1];
		for (int i = 0; i < t.length(); i++) {
			tt[i + 1] = tt[i] + toInt(t.charAt(i));
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			int v1 = ss[b[i]] - ss[a[i]];
			int v2 = tt[d[i]] - tt[c[i]];
			if (v1 % 3 == v2 % 3) {
				pw.println("YES");
			} else {
				pw.println("NO");
			}
		}
		pw.flush();
	}

	static int toInt(char ch) {
		return ch == 'A' ? 1 : 2;
	}
}

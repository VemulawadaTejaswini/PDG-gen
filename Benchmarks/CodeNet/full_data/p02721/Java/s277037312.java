import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		int[] l = new int[k];
		int idx = 0;
		for (int i = 0; i < k; i++) {
			while (s[idx] == 'x') {
				idx++;
			}
			l[i] = idx;
			idx += c + 1;
		}

		int[] r = new int[k];
		idx = n - 1;
		for (int i = k - 1; i >= 0; i--) {
			while (s[idx] == 'x') {
				idx--;
			}
			r[i] = idx;
			idx -= c + 1;
		}

		PrintWriter pw = new PrintWriter(System.out);
		pw.flush();
		for (int i = 0; i < k; i++) {
			if (l[i] == r[i]) {
				pw.println(l[i] + 1);
			}
		}
		pw.flush();
	}
}

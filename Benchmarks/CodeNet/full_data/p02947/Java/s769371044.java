import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		int n = ipt.nextInt();
		long ans = 0;
		String[][] txt = new String[n][10];
		String[] text = new String[n];
		for (int i = 0; i < n; i++) {
			txt[i] = ipt.next().split("");
			Arrays.sort(txt[i], Collections.reverseOrder());
			for (int j = 0; j < 10; j++)
				text[i] += txt[i][j];
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i) {
					continue;
				}
				if (text[i].equals(text[j])) {
					ans++;
				}
			}
		}
		System.out.println(ans / 2);
		ipt.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		boolean[] work = new boolean[n];
		for (int i = n - 1; i >= 0 && k > 0; i--) {
			if (s[i] == 'o') {
				work[i] = true;
				i -= c;
				k--;
			}
		}

		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (work[i]) {
				while (s[idx] == 'x') {
					idx++;
				}
				if (idx >= i) {
					System.out.println(i + 1);
				}
				idx += c + 1;
			}
		}
	}
}

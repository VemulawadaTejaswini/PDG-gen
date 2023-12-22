import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] c = new int[n - 1];
		int[] s = new int[n - 1];
		int[] f = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int t = 0;
			for (int j = i; j < n - 1; j++) {
				while (t < s[j] || t % f[j] != 0) {
					t++;
				}
				t += c[j];
			}
			System.out.println(t);
		}
		sc.close();
	}

}

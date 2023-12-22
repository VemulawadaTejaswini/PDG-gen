import java.util.Scanner;
class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextLong();
		String ans = "No";
		for (int j = 0; j < n; j++) {
			long hh = a[j];
			for (int i = 0; i < n; i++) {
					if (i == 0) {
						if (hh == (a[n - 1] ^ a[0])) {
							ans = "Yes";
						}
					} else if (hh == (a[i - 1] ^ a[(i + 1) % n])) ans = "Yes";
			}
		}
		System.out.println(ans);
    }
}
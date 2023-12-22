import java.util.Scanner;
class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextLong();

		String ans = "Yse";
		for (long i = 0; i < n-1; i++) {
			if (i > 0) {
				if ((a[(int) ((i + 1) % n)] ^ a[(int) ((i - 1) % n)]) != a[(int) i]) {
					ans = "No";
				}
			} else {
				if ((a[(int) ((i + 1) % n)] ^ a[(int) (n-1)]) != a[(int) i]) {
					ans = "No";
				}
			}
		}
		System.out.println(ans);
    }
}